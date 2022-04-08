package principal;

// Import de tudo da biblioteca sql
import java.sql.*;

public class Main {

    // URL do banco de dados
    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/comabemdb";

    public static void main(String[] args) {
        // Gerencia a conexao
        Connection connection = null;

        // Instrucao de consulta
        Statement stm = null;

        // Gerencia o resultado
        ResultSet rs = null;


        try {
            // Estabelece conexão com o banco de dados
            connection = DriverManager.getConnection(DATABASE_URL, "usuario", "root");

            // Criar statement para a consulta ao banco
            stm = connection.createStatement();

            // Consulta o banco
            rs = stm.executeQuery("SELECT LP.id_produtos AS 'Código', LP.nome AS 'Produto', " +
                    "V.preco_por_unidade_reais AS 'Preço', V.medidas_unidade AS 'Unidade'\n" +
                    "\tFROM lista_produtos AS LP\n" +
                    "\tJOIN valores AS V ON LP.id_valores = V.id_valores\n" +
                    "\tORDER BY LP.id_produtos;");

            // Diferentes exemplos de consulta:
            // "SELECT * FROM lista_produtos"
            // "SELECT LP.id_produtos AS 'Código', LP.nome AS 'Produto', " +
                    //"V.preco_por_unidade_reais AS 'Preço', V.medidas_unidade AS 'Unidade'\n" +
                    //"\tFROM lista_produtos AS LP\n" +
                    //"\tJOIN valores AS V ON LP.id_valores = V.id_valores\n" +
                    //"\tORDER BY LP.id_produtos;"


            // Apresentar o resultado
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " +
                        rs.getString(2) + " " +
                        rs.getDouble(3) + " " +
                        rs.getString(4));
            }
            connection.close();

        // Tratamento de erros
        } catch(SQLException se) {
            se.printStackTrace();
        }

    }
}
