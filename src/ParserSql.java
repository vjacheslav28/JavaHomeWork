import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserSql {

    /*
        сделать бсш, который на вход принимает
        название скрипта (с полным путём) и превращает скрипт в строку
        */
//тело метода в bsh:
    ////////
    public List<String> getMatchedConditions(final String sqlScript,final List<String> conditions) {
        String purifiedSqlScript = sqlScript.replaceAll("[ \\r\\n\\t]", "");

        return conditions.stream().filter(condition -> {
                    Pattern pattern = Pattern.compile(".*" + condition + ".*",
                            Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
                    Matcher matcher = pattern.matcher(purifiedSqlScript);
                    return false;
                }
    };
    /////////////
    public static void main(String[] args) {
        String sqlFileName = "C:\\Users\\User\\Desktop\\java\\IT_REGLAMENT.DN240188SKI1.PARSER_SQL_DATA_RP_lpar.sql"; // путь к скрипту
        String sqlFileContent = null;
        FileInputStream stream = null;

        try {
            // Получаем входящий поток из sql-скрипта.
            stream = new FileInputStream(sqlFileName);

            // Создаем массив байт из входящего потока из sql-скрипта.
            byte[] bytesFromFiles;

            bytesFromFiles = new byte[stream.available()];
            int i = stream.read();
            int cnt = 0;
            while (i != -1) {
                bytesFromFiles[cnt] = (byte) i;
                cnt++;
                i = stream.read();
            }

            sqlFileContent = new String(bytesFromFiles, "UTF-8");
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException ex) {
                    System.out.println("2222" + ex);
                }
            }
        }
        System.out.println("sqlFileContent  = " + sqlFileContent);
        System.out.println("sqlFileName  = " + sqlFileName);

    }
}

//1.на выходе в строке маска поиска и номер символа
//2.маска поиска задавать через справочник лайков создать табл.в айти регл.с заливкой справочников те что есть шапкина и добавить свои.
//рег.выражения идать им название регулярным веражениям
//тип шаблон дейт конверт что переадем
//складывать в файл результат
// андрей будет складывать результат
//внутри файла короткое наименования патерна и вход в строку.
//файл название скрипта, наименаование патерна и номер вхождения в код.
