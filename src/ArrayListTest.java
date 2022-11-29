import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //ArrayList<WrapperType> variable name = new ArrayList<WrapperType>();

        for (int lcv = 0; lcv < 100; lcv++) {
            int rand = (int) (Math.random() * 100) + 1;
            list.add(rand);
        }
        for (int lcv = 0; lcv < list.size(); lcv+=2){
            System.out.print(list.get(lcv) + " ");
        }
        System.out.println();

        if (list.contains(50)) System.out.println("Does list contain 59?" + list.contains(50));
        System.out.println("Index of 50: " + list.indexOf(50));
        for (int cur : list) {
            System.out.println(cur);
        }


    }
}

/*C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=57413:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" ArrayListTest
17 32 61 58 87 61 54 56 45 58 44 28 57 26 10 4 56 32 11 27 19 26 63 4 17 15 54 39 2 29 3 64 36 13 53 44 53 34 26 26 19 78 1 50 48 86 83 61 55 52
Does list contain 59?true
Index of 50: 86
17
25
32
68
61
69
58
1
87
21
61
91
54
46
56
49
45
24
58
51
44
36
28
64
57
57
26
55
10
56
4
80
56
49
32
7
11
40
27
79
19
28
26
70
63
29
4
40
17
45
15
80
54
78
39
66
2
54
29
32
3
31
64
46
36
14
13
9
53
18
44
28
53
87
34
44
26
83
26
98
19
49
78
23
1
56
50
89
48
33
86
73
83
8
61
83
55
66
52
85

Process finished with exit code 0

 */