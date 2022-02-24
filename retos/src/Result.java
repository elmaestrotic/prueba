import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



    class Result {

        /*
         * Complete the 'cantidadMinimaDeDias' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER_ARRAY x as parameter.
         */

        public static int cantidadMinimaDeDias(List<Integer> x) {
            List<Integer> unicos = x.stream().distinct().collect(
                    Collectors.toList());
            return unicos.size();

        }

    }

    class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int xCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> x = IntStream.range(0, xCount).mapToObj(i -> {
                        try {
                            return bufferedReader.readLine().replaceAll("\\s+$", "");
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    })
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .collect(toList());

            int result = Result.cantidadMinimaDeDias(x);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();





            bufferedReader.close();
            bufferedWriter.close();
        }
    }



