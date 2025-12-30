import java.util.ArrayList;
public class ContentDemo {
    public static void main(String[] args) {
        ArrayList<ContentItem> items = new ArrayList<>();
        items.add(new VideoLecture("Java OOP", 2024, 90, "HD"));
        items.add(new VideoLecture("Data Structures", 2022, 120, "4K"));
        items.add(new PodcastEpisode("Tech Talk", 2023, 45, "Alex"));
        items.add(new PodcastEpisode("IT News", 2021, 30, "Mira"));
        int currentYear = java.time.Year.now().getValue();
        for (ContentItem item : items) {
            System.out.println(item + " | licenseCost=" +
                    item.getLicenseCost(currentYear));
            if (item instanceof Downloadable) {
                Downloadable d = (Downloadable) item;
                d.download();
                System.out.println("Max downloads per day: " +
                        d.getMaxDownloadsPerDay());
            }
            System.out.println("---------------------");
        }
    }
}
