package javachallenges.autocorrect;

public class Solution1 {
  public static String autocorrect(String message) {
    String[] splitedMessage = message.split(" ");

    for (int i = 0; i < splitedMessage.length; i++) {

      boolean doesWordMatches =
          splitedMessage[i].matches("(u|U)")
              || splitedMessage[i].matches("(y|Y)o(u{1,})")
              || splitedMessage[i].matches("( |)(y|Y)(o)(u{1,})(\\.| |!|\\?)")
              || splitedMessage[i].matches("( |)(u|U)(\\.| )");

      if (doesWordMatches) {
        if (splitedMessage[i].endsWith(",")) {
          splitedMessage[i] = "your client,";
        } else if (splitedMessage[i].endsWith(".")) {
          splitedMessage[i] = "your client.";
        } else if (splitedMessage[i].endsWith("!")) {
          splitedMessage[i] = "your client!";
        } else if (splitedMessage[i].endsWith("?")) {
          splitedMessage[i] = "your client?";
        } else {
          splitedMessage[i] = "your client";
        }
      }
    }

    return String.join(" ", splitedMessage);
  }
}
