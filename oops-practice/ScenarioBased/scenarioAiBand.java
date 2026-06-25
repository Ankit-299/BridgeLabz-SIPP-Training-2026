// 4. AI-Based Content Moderation Platform
// A social media platform checks user posts for inappropriate content.
// ● Create interfaces:
// ○ TextModeration
// ○ SpamDetection
// ● Each interface contains:
// ○ abstract methods
// ○ default method displayModerationPolicy()
// ● Add a static method containsRestrictedWords(String
// post).
// Store multiple posts in a String[].
// Task: Implement both interfaces in ContentModerator and identify:
// ● spam posts
// ● offensive posts
// ● valid posts

interface TextModeration {
    default void displayModerationPolicy() {
        System.out.println("Text moderation policy: no offensive content allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        String[] restrictedWords = {"offensive", "badword", "inappropriate"};
        String lowerPost = post.toLowerCase();
        for (String word : restrictedWords) {
            if (lowerPost.contains(word)) {
                return true;
            }
        }
        return false;
    }

    boolean isOffensive(String post);
}

interface SpamDetection {
    default void displayModerationPolicy() {
        System.out.println("Spam detection policy: no spam content allowed.");
    }

    boolean isSpam(String post);
}

class ContentModerator implements TextModeration, SpamDetection {
    @Override
    public boolean isOffensive(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    @Override
    public boolean isSpam(String post) {
        String lowerPost = post.toLowerCase();
        return lowerPost.contains("buy")
            || lowerPost.contains("cheap")
            || lowerPost.contains("offer")
            || lowerPost.contains("spammywebsite.com");
    }

    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }

    public static boolean containsRestrictedWords(String post) {
        return TextModeration.containsRestrictedWords(post);
    }
}

public class scenarioAiBand {
    public static void main(String[] args) {
        String[] posts = {
            "This is a valid post.",
            "Buy cheap products at spammywebsite.com!",
            "This post contains offensive language.",
            "Check out this amazing offer!",
            "Another valid post."
        };

        ContentModerator moderator = new ContentModerator();

        for (String post : posts) {
            System.out.println("Post: \"" + post + "\"");
            if (ContentModerator.containsRestrictedWords(post)) {
                System.out.println("Result: Offensive content detected.");
            } else if (moderator.isSpam(post)) {
                System.out.println("Result: Spam content detected.");
            } else {
                System.out.println("Result: Valid post.");
            }
            System.out.println();
        }
    }
}
