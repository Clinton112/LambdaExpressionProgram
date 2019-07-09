/*
  Create class StreamDemo.
  Create List like-
  memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("ahana");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

  a)print all the names starts with A.
  b)print all the names in uppercase.
  c)print all the names in uppercase whose name ends with s.
  d)count all the names ends with h.
  e)find the first name starts with ‘S’.

  In the same class create another list of types numbers.
  a)print all the numbers which are even.
 */
package main.stackroute.LambdaProgram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamsDemo
{
    public static void main(String[] args)
    {
        List<String> members=new ArrayList<>();//string list object
        members= Arrays.asList("Amitabh","Shekhar","Aman","ahana","Shahrukh","Salman","Yana","Lokesh");
        members.stream()
                .filter(s -> s.startsWith("A"))
                .forEach(System.out::println);//print the members starting with 'A'
        System.out.println(" ------------------------------------------------------------");
        members.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);//print all members to uppercase
        System.out.println("--------------------------------------------------------------");
        members.stream()
                .filter(s -> s.startsWith("S"))
                .map(String::toUpperCase)
                .forEach(System.out::println);//print all members starting with 'S'
        int count=(int)members.stream()
                .filter(s -> s.endsWith("h"))
                .count();
        System.out.println(count);//count all members ending with s
        members.stream()
                .filter(s -> s.startsWith("S"))
                .forEach(System.out::println);
        IntStream
                .range(1,20)
                .filter(n->n%2==0)
                .forEach(System.out::println);

    }
}

