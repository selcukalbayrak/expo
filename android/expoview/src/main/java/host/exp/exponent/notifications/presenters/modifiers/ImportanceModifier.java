package host.exp.exponent.notifications.presenters.modifiers;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;

public class ImportanceModifier implements NotificationModifierInterface {
  @Override
  public void modify(NotificationCompat.Builder builder, Bundle notification, Context context, String experienceId) {
    if (notification.containsKey("priorityBelowOreo")) {
      // ToDo
    }
  }
}