// Generated from PanLang.g4 by ANTLR 4.13.2
package br.com.negraop.calculadora.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PanLangParser}.
 */
public interface PanLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PanLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(PanLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PanLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(PanLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PanLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(PanLangParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PanLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(PanLangParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PanLangParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaravar(PanLangParser.DeclaravarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PanLangParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaravar(PanLangParser.DeclaravarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PanLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(PanLangParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PanLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(PanLangParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PanLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(PanLangParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PanLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(PanLangParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PanLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(PanLangParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PanLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(PanLangParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PanLangParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdleitura(PanLangParser.CmdleituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PanLangParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdleitura(PanLangParser.CmdleituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PanLangParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdescrita(PanLangParser.CmdescritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PanLangParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdescrita(PanLangParser.CmdescritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PanLangParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdattrib(PanLangParser.CmdattribContext ctx);
	/**
	 * Exit a parse tree produced by {@link PanLangParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdattrib(PanLangParser.CmdattribContext ctx);
	/**
	 * Enter a parse tree produced by {@link PanLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PanLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PanLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PanLangParser.ExprContext ctx);
}