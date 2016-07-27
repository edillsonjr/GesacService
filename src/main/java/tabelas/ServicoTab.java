/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelas;

/**
 *
 * @author Edilson Jr
 */
public class ServicoTab implements Line {

    private final String DB = "SisCentralRel";
    private final String TABLE = "Servico";
    private final boolean HAVEID = true;
    private final int NUMCOMLUMNS = 6;
    private final String[] COLUMNNAMES = {"cod_servico",
        "dt_criacao_servico",
        "descricao",
        "dt_encerramento",
        "intervalo_ligacoes",
        "Usuario_cod_usuario"};

    private Object[] values = new Object[this.NUMCOMLUMNS];

    public ServicoTab() {
        values[0] = null;
        values[1] = null;
    }

    public ServicoTab(int ID) {
        values[0] = ID;
    }

    public ServicoTab(int ID, String nomeComplemento) {
        values[0] = ID;
        values[1] = nomeComplemento;
    }

    @Override
    public Object getValue(int index) throws ArrayIndexOutOfBoundsException {
        if (index > 1 || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Valor inserido esta fora do intervalo.");
        }
        return values[index];
    }

    public void setValue(Object o, int index) {
        this.values[index] = o;
    }

    @Override
    public String getDB() {
        return this.DB;
    }

    @Override
    public String getTableName() {
        return this.TABLE;
    }

    @Override
    public boolean haveID() {
        return this.HAVEID;
    }

    @Override
    public int getNumOfColumns() {
        return this.NUMCOMLUMNS;
    }

    @Override
    public String getColumnName(int index) throws ArrayIndexOutOfBoundsException {
        if (index > 1 || index < 0) {

            throw new ArrayIndexOutOfBoundsException("Valor inserido esta fora do intervalo.");
        }

        return this.COLUMNNAMES[index];

    }
}
