package br.com.negraop.calculadora.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import br.com.negraop.calculadora.parser.PanLangBaseVisitor;
import br.com.negraop.calculadora.parser.PanLangParser.*;

public class CalculadoraVisitorImpl extends PanLangBaseVisitor<Double> {
    private Map<String, Double> memory = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Double visitProg(ProgContext ctx) {
        // Visit declarations and block
        visit(ctx.decl());
        visit(ctx.bloco());
        return null; // No result needed
    }

    @Override
    public Double visitDeclaravar(DeclaravarContext ctx) {
        // Initialize variables to 0.0
        for (var id : ctx.ID()) {
            memory.put(id.getText(), 0.0);
        }
        return null;
    }

    @Override
    public Double visitCmdleitura(CmdleituraContext ctx) {
        String id = ctx.ID().getText();
        System.out.print("Digite o valor para " + id + ": ");
        double value = scanner.nextDouble();
        memory.put(id, value);
        return null;
    }

    @Override
    public Double visitCmdescrita(CmdescritaContext ctx) {
        String id = ctx.ID().getText();
        Double value = memory.get(id);
        if (value != null) {
            System.out.println(value);
        } else {
            System.err.println("Erro: variável " + id + " não inicializada.");
        }
        return null;
    }

    @Override
    public Double visitCmdattrib(CmdattribContext ctx) {
        String id = ctx.ID().getText();
        Double value = visit(ctx.expr());
        memory.put(id, value);
        return null;
    }

    @Override
    public Double visitExpr(ExprContext ctx) {
    if (ctx.OP_P() != null) {  // Checa se é uma multiplicação/divisão
        double left = visit(ctx.expr(0));
        double right = visit(ctx.expr(1));
        switch (ctx.OP_P().getText()) {
            case "*":
                return left * right;
            case "/":
                if (right == 0) {
                    throw new ArithmeticException("Divisão por zero.");
                }
                return left / right;
        }
    } else if (ctx.OP_S() != null) {  // Checa se é uma adição/subtração
        double left = visit(ctx.expr(0));
        double right = visit(ctx.expr(1));
        switch (ctx.OP_S().getText()) {
            case "+":
                return left + right;
            case "-":
                return left - right;
        }
    } else if (ctx.AP() != null) {  // Checa se é uma expressão entre parênteses
        return visit(ctx.expr(0));
    } else if (ctx.ID() != null) {  // Checa se é um identificador
        String id = ctx.ID().getText();
        Double value = memory.get(id);
        if (value == null) {
            throw new RuntimeException("Variável não inicializada: " + id);
        }
        return value;
    } else if (ctx.NUMBER() != null) {  // Checa se é um número
        return Double.parseDouble(ctx.NUMBER().getText());
    }
    return null;
}

}
