/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.mozstumbler.service.uploadthread;

/**
 * Created by victorng on 2014-09-29.
 */
public class AsyncUploadParam {

    final boolean useWifiOnly;
    final AsyncUploaderListener asyncListener;
    final String nickname;
    final String emailAddress;

    public AsyncUploadParam(boolean wifiOnly,
                            AsyncUploaderListener listener,
                            String nick,
                            String email) {

        if (email == null) {
            email = "";
        }

        if (nick == null) {
            nick = "";
        }

        useWifiOnly = wifiOnly;
        asyncListener = listener;
        nickname = nick;
        emailAddress = email;
    }
}