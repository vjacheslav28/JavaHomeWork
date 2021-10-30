import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ParserSql {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;
            int[] c = new int[a];
            c[a] = 6;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка." + e);
        }
        System.out.println("Уже после блока try-catch.");
    }
}
    /*
        сделать бсш, который на вход принимает
        название скрипта (с полным путём) и превращает скрипт в строку
        */
//тело метода в bsh:
    ////////
    /*public List<String> getMatchedConditions(final String sqlScript,final List<String> conditions) {
        String purifiedSqlScript = sqlScript.replaceAll("[ \\r\\n\\t]", "");

        Stream<String> stringStream = conditions.stream().filter(condition -> {
            Pattern pattern = Pattern.compile(".*" + condition + ".*",
                    Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
            Matcher matcher = pattern.matcher(purifiedSqlScript);
                    return stringStream;
        } */
    /////////////
    /*public static void main(String[] args){
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
}*/

//1.на выходе в строке маска поиска и номер символа
//2.маска поиска задавать через справочник лайков создать табл.в айти регл.с заливкой справочников те что есть шапкина и добавить свои.
//рег.выражения идать им название регулярным веражениям
//тип шаблон дейт конверт что переадем
//складывать в файл результат
// андрей будет складывать результат
//внутри файла короткое наименования патерна и вход в строку.
//файл название скрипта, наименаование патерна и номер вхождения в код.


/*
сделать бсш, который на вход принимает
название скрипта (с полным путём) и превращает скрипт в строку
*/
import java.io.FileInputStream;
        import java.io.IOException;
        import java.util.ArrayList;
        import com.dasad.util.sql.service.SqlScriptAnalysisService; //джарник парсера
//тело метода в bsh:
        constants();

        main(){

        String sqlFileName="/DATA/ftp/dn281087pvs/parser_sql/_uploaded.202007091143474347_load.sql"; // путь к скрипту
        String sqlFileContent=null;
        FileInputStream stream=null;

        try{
        // Получаем входящий поток из sql-скрипта.
        stream=new FileInputStream(sqlFileName);
        // Создаем массив байт из входящего потока из sql-скрипта.
        byte[]bytesFromFiles;

        bytesFromFiles=new byte[stream.available()];
        int i=stream.read();
        int cnt=0;
        while(i!=-1){
        bytesFromFiles[cnt]=(byte)i;
        cnt++;
        i=stream.read();
        //получаем список регулярок из справочника
        query2=
        " select CONDITION as \"condition\",  "   // регулярное выражение
        +"        DESCRIPTION,"   // описание правила
        +"        rulename    "   //id правила
        +"  from IT_REGLAMENT.SQL_INVALID_VALIDATION_CONDITION";
        //получаем массив строк
        ArrayList sql_invalid_validation_condition=sql_selectList("LPAR_1",query2);
        //обьявляем переменные для джарника
        List conditions=new ArrayList();
        for(int i=0;i<sql_invalid_validation_condition.size();i++){
        String condition=sql_invalid_validation_condition.get(i).get("condition");
        String rulename=sql_invalid_validation_condition.get(i).get("rulename").trim();
        print("CONDITIONS = "+conditions);
        //    print("rulename = " + rulename);
        print("errors=  "+errors);
        conditions.add(condition);
        } //для query2
        sqlFileContent=new String(bytesFromFiles,"UTF-8");
        }catch(Exception ex){
        print(ex);
        }finally{
        if(stream!=null){
        try{
        stream.close();
        }catch(IOException e){
        print(e);
        }
        }
        }
        print("sqlFileContent ="+sqlFileContent);
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

/*
сделать бсш, который на вход принимает
название скрипта (с полным путём) и превращает скрипт в строку
*/
        import java.io.FileInputStream;
        import java.io.IOException;
        import java.util.ArrayList;
        import com.dasad.util.sql.service.SqlScriptAnalysisService; //джарник парсера
//тело метода в bsh:

        constants();

        main() {

        String sqlFileName = "/DATA/ftp/dn281087pvs/parser_sql/_uploaded.202007091143474347_load.sql"; // путь к скрипту
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
        //получаем список регулярок из справочника
        query2 =
        " select CONDITION as \"condition\",  "   // регулярное выражение
        + "        DESCRIPTION,"   // описание правила
        + "        rulename    "   //id правила
        + "  from IT_REGLAMENT.SQL_INVALID_VALIDATION_CONDITION";
        //получаем массив строк
        ArrayList sql_invalid_validation_condition = sql_selectList("LPAR_1", query2);
        //обьявляем переменные для джарника
        List conditions = new ArrayList();


        for (int i = 0; i < sql_invalid_validation_condition.size(); i++) {
        String condition = sql_invalid_validation_condition.get(i).get("condition");
        String rulename = sql_invalid_validation_condition.get(i).get("rulename").trim();
        print("CONDITIONS = " + conditions);
        print("rulename = " + rulename);
        //print("errors=  " +errors);
        conditions.add(condition);
        } //для query2
        sqlFileContent = new String(bytesFromFiles, "UTF-8");
        } catch (Exception ex) {
        print(ex);
        return false;
        } finally {
        if (stream != null) {
        try {
        stream.close();
        } catch (IOException e) {
        print(e);
        }
        }
        }
        print("sqlFileContent =" + sqlFileContent);
        setFinishExecutionTime(execDate, scriptsName);
        return true;
        }
        return main();
//1.на выходе в строке маска поиска и номер символа
//2.маска поиска задавать через справочник лайков создать табл.в айти регл.с заливкой справочников те что есть шапкина и добавить свои.
//рег.выражения идать им название регулярным веражениям
//тип шаблон дейт конверт что переадем
//складывать в файл результат
// андрей будет складывать результат
//внутри файла короткое наименования патерна и вход в строку.
//файл название скрипта, наименаование патерна и номер вхождения в код.


