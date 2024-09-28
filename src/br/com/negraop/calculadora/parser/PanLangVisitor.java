// Generated from PanLang.g4 by ANTLR 4.13.2
package br.com.negraop.calculadora.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PanLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PanLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PanLangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(PanLangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PanLangParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(PanLangParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PanLangParser#declaravar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaravar(PanLangParser.DeclaravarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PanLangParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(PanLangParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PanLangParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(PanLangParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PanLangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(PanLangParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PanLangParser#cmdleitura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdleitura(PanLangParser.CmdleituraContext ctx);
	/**
	 * Visit a parse tree produced by {@link PanLangParser#cmdescrita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdescrita(PanLangParser.CmdescritaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PanLangParser#cmdattrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdattrib(PanLangParser.CmdattribContext ctx);
	/**
	 * Visit a parse tree produced by {@link PanLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PanLangParser.ExprContext ctx);
}