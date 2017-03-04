package nana.com.materialdesain;

/**
 * Created by Nana Febriana on 04-Mar-17.
 */

public class NavDraweItem {

    private boolean showNotify;
    private String title;

    public NavDraweItem() {
    }

    public NavDraweItem(boolean showNotify, String title) {
        this.showNotify = showNotify;
        this.title = title;
    }

    public boolean isShowNotify() {
        return showNotify;
    }

    public void setShowNotify(boolean showNotify) {
        this.showNotify = showNotify;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
