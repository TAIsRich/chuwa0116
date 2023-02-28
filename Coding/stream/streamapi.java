import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

class streamapi{
    public static void main(String [] args)
    {
        int [] arr=new int[]{1,2,3,4,5,6};
        arr=Arrays.stream(arr).map((e)-> e +10).toArray();
        for(int i=0;i<arr.length;++i){
            System.out.println(arr[i]);
        }
    }

    public void creation(){
        // Empty Stream
        Stream<String> streamEmpty=Stream.empty();

        // Stream of Collection
        Collection<String> collection=Array.asList("a","b","c");
        Stream<String> streamOfCollection=collection.stream();


        // Stream of Array
        String[]arr=new String[]{"a","b","c"};
        Stream<String> streamOfArrayFull=Arrays.stream(arr);
        Stream<string> streamOfArrayPart=Arrays.stream(arr,1,3);

        // Stream builder()
        Stream<String> streamBuilder=Stream<String> builder()
        .add("a")
        .add("b")
        .add("c")
        .build();

        //Stream generate()
        Stream<String> streamGenerated=Stream.generate(()->"element").limit(10);

        //Stream iterate
        Stream<Integer> streamIterated=Stream.iterate(40,n->n+2).limit(10);

        // Stream of Primitive
        IntStream intStream=IntStream.range(1,3);
        LongStream longStream=LongStream.rangeClosed(1,3);
        Random random=new Random();
        DoubleStream doubleStream=random.doubles(3);

        // Stream of String
        IntStream streamOfChars="abc".chars();

        // Stream of file
        Path path=Paths.get("");
        Stream<String> StreamOfStrings=Files.lines(path);
        Stream<String> streamWithCharset=Files.lines(path,Charset.forName("UTF-8"));

        

    }

    public void ReferencingStream(){
        Stream<String> stream=Stream.of("a","b","c")
        .filter(e->e.contains("b"));
        Optional<String> anyElement=stream.findAny();
        Optional<String> firstElement=stream.findFirst();
    }

    public void ParallelStream(){
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<10;++i){
            list.add(i);
        }
        Stream<Integer> stream=list.parallelStream();
        Integer[] evenNumbersArr=stream
        .filter(i->i%2==0)
        .toArray(Integer[]::new);
        System.out.print(evenNumbersArr);
    }
}