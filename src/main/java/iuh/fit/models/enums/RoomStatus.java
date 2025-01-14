package iuh.fit.models.enums;

import lombok.RequiredArgsConstructor;

/**
 * @author Le Tran Gia Huy
 * @created 14/01/2025 - 9:58 AM
 * @project Hotel-Management-Plus
 * @package iuh.fit.models.enums
 */

@RequiredArgsConstructor
public enum RoomStatus {
    AVAILABLE("Phòng trống"),
    ON_USE("Đang sử dụng"),
    UNAVAILABLE("Không sử dụng");

    public final String roomStatus;

    public String toString() {
        return roomStatus;
    }
}