package model.room.enums;

public enum RoomType {
    SINGLE("1"),
    DOUBLE("2");

    public final String tags;

    private RoomType(String tags) {
        this.tags = tags;
    }

    public static RoomType valueOfTags(String tags) {
        for (RoomType roomType : values()) {
            if (roomType.tags.equals(tags)) {
                return roomType;
            }
        }
        throw new IllegalArgumentException();
    }
}
