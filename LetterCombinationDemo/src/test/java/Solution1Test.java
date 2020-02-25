import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


class Solution1Test {
    private static final Logger logger = LoggerFactory.getLogger(Solution1Test.class);
    private static final String MESSAGE_SHOULD_BE_THE_SAME = "Should be the same.";
    private static final String MESSAGE_TEST_FAILS_WITH_UNEXPECTED_EXCEPTION = "Test fails with unexpected exception.";

    @BeforeAll
    static void initAll() {
        logger.info("");
        logger.info("Tests begin");
        logger.info("");
    }


    @BeforeEach
    void init() {
    }


    @Test
    void letterCombinationTest_NegativeValue() {
        String actual = null;
        String expected = null;

        // Case 1 -- -1
        actual = Solution1.letterCombination(new int[] {-1});
        expected = Solution1.MESSAGE_ERROR_NEGATIVE_VALUE;
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 2 -- -2
        actual = Solution1.letterCombination(new int[] {-2});
        expected = Solution1.MESSAGE_ERROR_NEGATIVE_VALUE;
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 3 -- 1, -1, 9
        actual = Solution1.letterCombination(new int[] {1, -1, 9});
        expected = Solution1.MESSAGE_ERROR_NEGATIVE_VALUE;
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 4 -- 1, 9, -1
        actual = Solution1.letterCombination(new int[] {1, 9, -1});
        expected = Solution1.MESSAGE_ERROR_NEGATIVE_VALUE;
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);
    }


    @Test
    void letterCombinationTest_ExceedValue() {
        String actual = null;
        String expected = null;

        // Case 1 -- 100
        actual = Solution1.letterCombination(new int[] {100});
        expected = Solution1.MESSAGE_ERROR_EXCEED_VALUE;
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 2 -- 1000
        actual = Solution1.letterCombination(new int[] {1000});
        expected = Solution1.MESSAGE_ERROR_EXCEED_VALUE;
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 3 -- 1, 2, 100
        actual = Solution1.letterCombination(new int[] {1, 2, 100});
        expected = Solution1.MESSAGE_ERROR_EXCEED_VALUE;
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 4 -- 100, 1, 2
        actual = Solution1.letterCombination(new int[] {100, 1, 2});
        expected = Solution1.MESSAGE_ERROR_EXCEED_VALUE;
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);
    }


    @Test
    void letterCombinationTest_ValidValue() {
        String actual = null;
        String expected = null;

        // Case 1 -- 0
        actual = Solution1.letterCombination(new int[] {});
        expected = "";
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 2 -- 0
        actual = Solution1.letterCombination(new int[] {0});
        expected = "";
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 3 -- 1
        actual = Solution1.letterCombination(new int[] {1});
        expected = "";
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 4 -- 2
        actual = Solution1.letterCombination(new int[] {2});
        expected = "a b c";
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 5 -- 7
        actual = Solution1.letterCombination(new int[] {7});
        expected = "p q r s";
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 6 -- 9
        actual = Solution1.letterCombination(new int[] {9});
        expected = "w x y z";
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 7 -- 1, 2
        actual = Solution1.letterCombination(new int[] {1, 2});
        expected = "a b c";
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 8 -- 2, 3
        actual = Solution1.letterCombination(new int[] {2, 3});
        expected = "ad ae af bd be bf cd ce cf";
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 9 -- 2, 9
        actual = Solution1.letterCombination(new int[] {2, 9});
        expected = "aw ax ay az bw bx by bz cw cx cy cz";
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 10 -- 0, 2, 3
        actual = Solution1.letterCombination(new int[] {0, 2, 3});
        expected = "ad ae af bd be bf cd ce cf";
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 11 -- 2, 0, 3
        actual = Solution1.letterCombination(new int[] {2, 0, 3});
        expected = "ad ae af bd be bf cd ce cf";
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 12 -- 2, 3, 0
        actual = Solution1.letterCombination(new int[] {2, 3, 0});
        expected = "ad ae af bd be bf cd ce cf";
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 13 -- 1, 2, 3
        actual = Solution1.letterCombination(new int[] {1, 2, 3});
        expected = "ad ae af bd be bf cd ce cf";
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 14 -- 2, 1, 3
        actual = Solution1.letterCombination(new int[] {2, 1, 3});
        expected = "ad ae af bd be bf cd ce cf";
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 15 -- 2, 3, 1
        actual = Solution1.letterCombination(new int[] {2, 3, 1});
        expected = "ad ae af bd be bf cd ce cf";
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 16 -- 2, 3, 9
        actual = Solution1.letterCombination(new int[] {2, 3, 9});
        expected = "adw adx ady adz aew aex aey aez afw afx afy afz bdw bdx bdy bdz bew bex bey bez bfw bfx bfy bfz cdw cdx cdy cdz cew cex cey cez cfw cfx cfy cfz";
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 17 -- 10, 2, 3, 9
        actual = Solution1.letterCombination(new int[] {10, 2, 3, 9});
        expected = "adw adx ady adz aew aex aey aez afw afx afy afz bdw bdx bdy bdz bew bex bey bez bfw bfx bfy bfz cdw cdx cdy cdz cew cex cey cez cfw cfx cfy cfz";
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 18 -- 2, 10, 3, 9
        actual = Solution1.letterCombination(new int[] {2, 10, 3, 9});
        expected = "adw adx ady adz aew aex aey aez afw afx afy afz bdw bdx bdy bdz bew bex bey bez bfw bfx bfy bfz cdw cdx cdy cdz cew cex cey cez cfw cfx cfy cfz";
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 19 -- 2, 3, 10, 9
        actual = Solution1.letterCombination(new int[] {2, 3, 10, 9});
        expected = "adw adx ady adz aew aex aey aez afw afx afy afz bdw bdx bdy bdz bew bex bey bez bfw bfx bfy bfz cdw cdx cdy cdz cew cex cey cez cfw cfx cfy cfz";
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 20 -- 2, 3, 9, 10
        actual = Solution1.letterCombination(new int[] {2, 3, 9, 10});
        expected = "adw adx ady adz aew aex aey aez afw afx afy afz bdw bdx bdy bdz bew bex bey bez bfw bfx bfy bfz cdw cdx cdy cdz cew cex cey cez cfw cfx cfy cfz";
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 21 -- 2, 30
        actual = Solution1.letterCombination(new int[] {2, 30});
        expected = "ad ae af bd be bf cd ce cf";
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 22 -- 2, 99
        actual = Solution1.letterCombination(new int[] {2, 99});
        expected = "aww awx awy awz axw axx axy axz ayw ayx ayy ayz azw azx azy azz bww bwx bwy bwz bxw bxx bxy bxz byw byx byy byz bzw bzx bzy bzz cww cwx cwy cwz cxw cxx cxy cxz cyw cyx cyy cyz czw czx czy czz";
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);

        // Case 23 -- 99, 2
        actual = Solution1.letterCombination(new int[] {99, 2,});
        expected = "wwa wwb wwc wxa wxb wxc wya wyb wyc wza wzb wzc xwa xwb xwc xxa xxb xxc xya xyb xyc xza xzb xzc ywa ywb ywc yxa yxb yxc yya yyb yyc yza yzb yzc zwa zwb zwc zxa zxb zxc zya zyb zyc zza zzb zzc";
        Assertions.assertEquals(expected, actual, MESSAGE_SHOULD_BE_THE_SAME);
    }


    @AfterEach
    void tearDown() {
    }


    @AfterAll
    static void tearDownAll() {
        logger.info("");
        logger.info("Tests completed");
        logger.info("");
    }


}
