
package ex.obj;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Attachment {

    @SerializedName("doc")
    private Doc mDoc;
    @SerializedName("link")
    private Link mLink;
    @SerializedName("photo")
    private Photo mPhoto;
    @SerializedName("poll")
    private Poll mPoll;
    @SerializedName("type")
    private String mType;
    @SerializedName("video")
    private Video mVideo;

    public Doc getDoc() {
        return mDoc;
    }

    public void setDoc(Doc doc) {
        mDoc = doc;
    }

    public Link getLink() {
        return mLink;
    }

    public void setLink(Link link) {
        mLink = link;
    }

    public Photo getPhoto() {
        return mPhoto;
    }

    public void setPhoto(Photo photo) {
        mPhoto = photo;
    }

    public Poll getPoll() {
        return mPoll;
    }

    public void setPoll(Poll poll) {
        mPoll = poll;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public Video getVideo() {
        return mVideo;
    }

    public void setVideo(Video video) {
        mVideo = video;
    }

}
