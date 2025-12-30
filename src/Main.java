public static void main(String[] args) {

    ArrayList<ContentItem> items = new ArrayList<>();

    items.add(new VideoLecture("Java OOP", 2024, 90, "HD"));
    items.add(new PodcastEpisode("Tech Talk", 2023, 45, "Alex"));

    int currentYear = java.time.Year.now().getValue();

    for (ContentItem item : items) {
        System.out.println(item);
    }
}
