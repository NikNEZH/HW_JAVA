// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, 
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.

// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
package HW2;

public class EX1 {
    public static void main(String[] args) {

        String str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
        StringBuilder sb = new StringBuilder();
        String[] arr = str.split(",");
        for (String s : arr) {
        if (!s.contains("null") || s.endsWith("AND")) {
            sb.append(s).append("  AND "); 
            
        }
        // if (sb.toString().endsWith(" AND")) {
        //     System.out.println("proverka");
        //     s.substring(0, s.length() - 1);
        // }
        }
        
        String result = sb.toString().replace(":", " = ")
                            .replace("{", "")
                            .substring(0, sb.length() - 1);

        System.out.println("select * from students where " + result);
    }
}
 