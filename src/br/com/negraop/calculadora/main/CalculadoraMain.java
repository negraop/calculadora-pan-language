package br.com.negraop.calculadora.main;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import br.com.negraop.calculadora.parser.PanLangLexer;
import br.com.negraop.calculadora.parser.PanLangParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CalculadoraMain {

    public static void main(String[] args) throws IOException {
        // Leia o arquivo .pan
        String input = new String(Files.readAllBytes(Paths.get("input.pan")));

        // Configure o lexer e o parser
        PanLangLexer lexer = new PanLangLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PanLangParser parser = new PanLangParser(tokens);

        // Parseie o programa e execute usando o visitor
        CalculadoraVisitorImpl visitor = new CalculadoraVisitorImpl();
        visitor.visit(parser.prog());
    }
}
