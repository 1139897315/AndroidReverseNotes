package com.tencent.wework.api.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wework.api.model.WWMediaMessage.WWMediaObject;

public class WWMediaText extends WWMediaObject {
    public String text;

    public WWMediaText(String str) {
        this.text = str;
    }

    public final boolean checkArgs() {
        AppMethodBeat.m2504i(80513);
        if (!super.checkArgs()) {
            AppMethodBeat.m2505o(80513);
            return false;
        } else if (this.text == null || this.text.length() == 0 || this.text.length() > 10240) {
            AppMethodBeat.m2505o(80513);
            return false;
        } else {
            AppMethodBeat.m2505o(80513);
            return true;
        }
    }

    public final void toBundle(Bundle bundle) {
        AppMethodBeat.m2504i(80514);
        bundle.putString("_wwtextobject_text", this.text);
        super.toBundle(bundle);
        AppMethodBeat.m2505o(80514);
    }
}
