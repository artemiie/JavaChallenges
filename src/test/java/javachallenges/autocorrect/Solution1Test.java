package javachallenges.autocorrect;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Solution1Test {
  @Test
  public void test() {
    Assertions.assertAll(
        () -> Assertions.assertEquals("your client", Solution1.autocorrect("u")),
        () -> Assertions.assertEquals("your client.", Solution1.autocorrect("u.")),
        () -> Assertions.assertEquals("your client", Solution1.autocorrect("U")),
        () -> Assertions.assertEquals("your client.", Solution1.autocorrect("U.")),
        () -> Assertions.assertEquals("your client", Solution1.autocorrect("you")),
        () -> Assertions.assertEquals("your client", Solution1.autocorrect("You")),
        () -> Assertions.assertEquals("your client.", Solution1.autocorrect("you.")),
        () -> Assertions.assertEquals("your client.", Solution1.autocorrect("You.")),
        () -> Assertions.assertEquals("your client", Solution1.autocorrect("youuuuuuu")),
        () -> Assertions.assertEquals("your client.", Solution1.autocorrect("youuuuuuu.")),
        () -> Assertions.assertEquals("your client", Solution1.autocorrect("Youuuuuuu")),
        () -> Assertions.assertEquals("your client.", Solution1.autocorrect("Youuuuuuu.")),
        () -> Assertions.assertEquals("youtube", Solution1.autocorrect("youtube")),
        () -> Assertions.assertEquals("I miss your client?", Solution1.autocorrect("I miss you?")),
        () -> Assertions.assertEquals("I miss your client!", Solution1.autocorrect("I miss you!")),
        () ->
            Assertions.assertEquals(
                "your client want to go to the movies?",
                Solution1.autocorrect("u want to go to the movies?")),
        () ->
            Assertions.assertEquals(
                "Can't wait to see your client",
                Solution1.autocorrect("Can't wait to see youuuuu")),
        () ->
            Assertions.assertEquals(
                "I want to film the bayou with your client and put it on youtube",
                Solution1.autocorrect("I want to film the bayou with you and put it on youtube")),
        () ->
            Assertions.assertEquals(
                "your client should come over Friday night",
                Solution1.autocorrect("You should come over Friday night")),
        () ->
            Assertions.assertEquals(
                "your client should come over Friday night",
                Solution1.autocorrect("You should come over Friday night")),
        () ->
            Assertions.assertEquals(
                "your client your client youville utube your client youyouyou uuu raiyou united your client your client your client",
                Solution1.autocorrect(
                    "You u youville utube you youyouyou uuu raiyou united youuuu u you")),
        () ->
            Assertions.assertEquals(
                "your client = best kisser", Solution1.autocorrect("You = best kisser")),
        () -> Assertions.assertEquals("i <3 your client", Solution1.autocorrect("i <3 u")),
        () ->
            Assertions.assertEquals(
                "Let's put your client on youtube",
                Solution1.autocorrect("Let's put you on youtube")),
        () ->
            Assertions.assertEquals(
                "my friend Alabinyou is conveniently named, and he wants to make a website called youwin with your client",
                Solution1.autocorrect(
                    "my friend Alabinyou is conveniently named, and he wants to make a website called youwin with youuu")),
        () ->
            Assertions.assertEquals(
                "your client should be famous on youville",
                Solution1.autocorrect("You should be famous on youville")),
        () ->
            Assertions.assertEquals(
                "Hope to see your client there!", Solution1.autocorrect("Hope to see u there!")),
        () ->
            Assertions.assertEquals(
                "Our team is excited to finish this with your client.",
                Solution1.autocorrect("Our team is excited to finish this with you.")),
        () ->
            Assertions.assertEquals(
                "We have sent the deliverables to your client.",
                Solution1.autocorrect("We have sent the deliverables to you.")));
  }
}
