package in.mobileappdev.firebasepushnotifications.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by satyanarayana.avv on 22-07-2016.
 */

public class MobileAppDevFirebaseInstanceIDService extends FirebaseInstanceIdService {

  private String TAG = "FirebaseInstanceService";

  @Override
  public void onTokenRefresh() {
    // Get updated InstanceID token.
    String refreshedToken = FirebaseInstanceId.getInstance().getToken();
    Log.d(TAG, "onTokenRefresh: "+refreshedToken);
    // TODO: Implement this method to send any registration to your app's servers.
    //sendRegistrationToServer(refreshedToken);
  }
}
