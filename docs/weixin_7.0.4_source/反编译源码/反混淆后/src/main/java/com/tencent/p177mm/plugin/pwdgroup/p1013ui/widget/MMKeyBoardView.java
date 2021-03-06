package com.tencent.p177mm.plugin.pwdgroup.p1013ui.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.util.CrashUtils.ErrorDialogData;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.C25738R;
import com.tencent.p177mm.sdk.platformtools.C4990ab;
import com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKConst;

/* renamed from: com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView */
public class MMKeyBoardView extends LinearLayout implements OnClickListener, OnLongClickListener {
    /* renamed from: lP */
    private ColorStateList f4390lP;
    private Context mContext;
    private float nnX;
    private C21513a prB;
    private Button prU;
    private Button prV;
    private Button prW;
    private Button prX;
    private Button prY;
    private Button prZ;
    private Button psa;
    private Button psb;
    private Button psc;
    private Button psd;
    private ImageButton pse;
    private View psf;
    private View psg;
    private View psh;
    private View psi;
    private View psj;
    private View psk;
    private boolean psl;
    private int psm;
    private int psn;
    private int pso;
    private int psp;
    private int psq;
    private int psr;
    private int pss;
    private int pst;
    private int psu;

    /* renamed from: com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView$a */
    public interface C21513a {
        void axQ();

        void delete();

        void input(String str);
    }

    /* renamed from: com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView$1 */
    class C215141 implements Runnable {
        C215141() {
        }

        public final void run() {
            AppMethodBeat.m2504i(24045);
            MMKeyBoardView.this.requestLayout();
            AppMethodBeat.m2505o(24045);
        }
    }

    public MMKeyBoardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public MMKeyBoardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        AppMethodBeat.m2504i(24046);
        this.psl = true;
        this.mContext = context;
        this.psm = getResources().getDimensionPixelSize(C25738R.dimen.f9655ac);
        this.psn = getResources().getDimensionPixelSize(C25738R.dimen.f9656ad);
        this.nnX = (float) getResources().getDimensionPixelSize(C25738R.dimen.f9657ae);
        this.f4390lP = getResources().getColorStateList(C25738R.color.a7j);
        this.pso = getResources().getColor(C25738R.color.f12110ss);
        this.prU = new Button(this.mContext);
        this.prV = new Button(this.mContext);
        this.prW = new Button(this.mContext);
        this.prX = new Button(this.mContext);
        this.prY = new Button(this.mContext);
        this.prZ = new Button(this.mContext);
        this.psa = new Button(this.mContext);
        this.psb = new Button(this.mContext);
        this.psc = new Button(this.mContext);
        this.psd = new Button(this.mContext);
        this.pse = new ImageButton(this.mContext);
        this.psf = new View(this.mContext);
        this.psf = new View(this.mContext);
        this.psg = new View(this.mContext);
        this.psh = new View(this.mContext);
        this.psi = new View(this.mContext);
        this.psj = new View(this.mContext);
        this.psk = new View(this.mContext);
        this.prU.setBackgroundResource(C25738R.drawable.f6792qy);
        this.prV.setBackgroundResource(C25738R.drawable.f6792qy);
        this.prW.setBackgroundResource(C25738R.drawable.f6792qy);
        this.prX.setBackgroundResource(C25738R.drawable.f6792qy);
        this.prY.setBackgroundResource(C25738R.drawable.f6792qy);
        this.prZ.setBackgroundResource(C25738R.drawable.f6792qy);
        this.psa.setBackgroundResource(C25738R.drawable.f6792qy);
        this.psb.setBackgroundResource(C25738R.drawable.f6792qy);
        this.psc.setBackgroundResource(C25738R.drawable.f6792qy);
        this.prZ.setBackgroundResource(C25738R.drawable.f6792qy);
        this.psd.setBackgroundResource(C25738R.drawable.f6792qy);
        this.pse.setBackgroundResource(C25738R.drawable.f6792qy);
        this.pse.setImageResource(C25738R.drawable.f6793qz);
        this.prU.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
        this.prV.setText("1");
        this.prW.setText("2");
        this.prX.setText(TMQQDownloaderOpenSDKConst.VERIFYTYPE_ALL);
        this.prY.setText("4");
        this.prZ.setText("5");
        this.psa.setText("6");
        this.psb.setText("7");
        this.psc.setText("8");
        this.psd.setText("9");
        this.prU.setGravity(17);
        this.prV.setGravity(17);
        this.prW.setGravity(17);
        this.prX.setGravity(17);
        this.prY.setGravity(17);
        this.prZ.setGravity(17);
        this.psa.setGravity(17);
        this.psb.setGravity(17);
        this.psc.setGravity(17);
        this.psd.setGravity(17);
        this.prU.setTextSize(0, this.nnX);
        this.prV.setTextSize(0, this.nnX);
        this.prW.setTextSize(0, this.nnX);
        this.prX.setTextSize(0, this.nnX);
        this.prY.setTextSize(0, this.nnX);
        this.prZ.setTextSize(0, this.nnX);
        this.psa.setTextSize(0, this.nnX);
        this.psb.setTextSize(0, this.nnX);
        this.psc.setTextSize(0, this.nnX);
        this.psd.setTextSize(0, this.nnX);
        this.prU.setTextColor(this.f4390lP);
        this.prV.setTextColor(this.f4390lP);
        this.prW.setTextColor(this.f4390lP);
        this.prX.setTextColor(this.f4390lP);
        this.prY.setTextColor(this.f4390lP);
        this.prZ.setTextColor(this.f4390lP);
        this.psa.setTextColor(this.f4390lP);
        this.psb.setTextColor(this.f4390lP);
        this.psc.setTextColor(this.f4390lP);
        this.psd.setTextColor(this.f4390lP);
        this.prU.setOnClickListener(this);
        this.prV.setOnClickListener(this);
        this.prW.setOnClickListener(this);
        this.prX.setOnClickListener(this);
        this.prY.setOnClickListener(this);
        this.prZ.setOnClickListener(this);
        this.psa.setOnClickListener(this);
        this.psb.setOnClickListener(this);
        this.psc.setOnClickListener(this);
        this.psd.setOnClickListener(this);
        this.pse.setOnClickListener(this);
        this.pse.setOnLongClickListener(this);
        this.psf.setBackgroundColor(this.pso);
        this.psf.setBackgroundColor(this.pso);
        this.psg.setBackgroundColor(this.pso);
        this.psh.setBackgroundColor(this.pso);
        this.psi.setBackgroundColor(this.pso);
        this.psj.setBackgroundColor(this.pso);
        this.psk.setBackgroundColor(this.pso);
        addView(this.prU);
        addView(this.prV);
        addView(this.prW);
        addView(this.prX);
        addView(this.prY);
        addView(this.prZ);
        addView(this.psa);
        addView(this.psb);
        addView(this.psc);
        addView(this.psd);
        addView(this.pse);
        addView(this.psf);
        addView(this.psg);
        addView(this.psh);
        addView(this.psi);
        addView(this.psj);
        addView(this.psk);
        post(new C215141());
        AppMethodBeat.m2505o(24046);
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AppMethodBeat.m2504i(24047);
        super.onLayout(z, i, i2, i3, i4);
        this.psp = getWidth();
        this.psq = getHeight();
        int i5 = -this.psn;
        int i6 = (this.pst - this.psn) + 1;
        int i7 = ((this.pst * 2) - this.psn) + 2;
        int i8 = this.psu + 2;
        int i9 = (this.psu * 2) + 3;
        int i10 = (this.psu * 3) + 4;
        this.prV.layout(i5, 1, this.psr + i5, this.pss + 1);
        this.prW.layout(i6, 1, this.psr + i6, this.pss + 1);
        this.prX.layout(i7, 1, this.psr + i7, this.pss + 1);
        this.prY.layout(i5, i8, this.psr + i5, this.pss + i8);
        this.prZ.layout(i6, i8, this.psr + i6, this.pss + i8);
        this.psa.layout(i7, i8, this.psr + i7, this.pss + i8);
        this.psb.layout(i5, i9, this.psr + i5, this.pss + i9);
        this.psc.layout(i6, i9, this.psr + i6, this.pss + i9);
        this.psd.layout(i7, i9, this.psr + i7, this.pss + i9);
        this.prU.layout(i6, i10, this.psr + i6, this.pss + i10);
        this.pse.layout(i7, i10, this.psr + i7, this.pss + i10);
        this.psf.layout(0, this.psm + 1, this.psp, (this.psm + 1) + 1);
        this.psg.layout(0, this.psm + i8, this.psp, (i8 + this.psm) + 1);
        this.psh.layout(0, this.psm + i9, this.psp, (i9 + this.psm) + 1);
        this.psi.layout(0, this.psm + i10, this.psp, (this.psm + i10) + 1);
        this.psj.layout(this.pst + 1, this.psm, this.pst + 2, this.psq);
        this.psk.layout((this.pst * 2) + 2, this.psm, (this.pst * 2) + 3, this.psq);
        AppMethodBeat.m2505o(24047);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        AppMethodBeat.m2504i(24048);
        super.onMeasure(i, i2);
        this.psp = getWidth();
        this.psq = getHeight();
        if (!(this.psp == 0 || this.psq == 0)) {
            this.pst = (this.psp - 2) / 3;
            this.psu = ((this.psq - this.psm) - 4) / 4;
            this.psr = this.pst + (this.psn * 2);
            this.pss = this.psu + (this.psm * 2);
        }
        this.prV.measure(MeasureSpec.makeMeasureSpec(this.psr, ErrorDialogData.SUPPRESSED), MeasureSpec.makeMeasureSpec(this.pss, ErrorDialogData.SUPPRESSED));
        this.prW.measure(MeasureSpec.makeMeasureSpec(this.psr, ErrorDialogData.SUPPRESSED), MeasureSpec.makeMeasureSpec(this.pss, ErrorDialogData.SUPPRESSED));
        this.prX.measure(MeasureSpec.makeMeasureSpec(this.psr, ErrorDialogData.SUPPRESSED), MeasureSpec.makeMeasureSpec(this.pss, ErrorDialogData.SUPPRESSED));
        this.prY.measure(MeasureSpec.makeMeasureSpec(this.psr, ErrorDialogData.SUPPRESSED), MeasureSpec.makeMeasureSpec(this.pss, ErrorDialogData.SUPPRESSED));
        this.prZ.measure(MeasureSpec.makeMeasureSpec(this.psr, ErrorDialogData.SUPPRESSED), MeasureSpec.makeMeasureSpec(this.pss, ErrorDialogData.SUPPRESSED));
        this.psa.measure(MeasureSpec.makeMeasureSpec(this.psr, ErrorDialogData.SUPPRESSED), MeasureSpec.makeMeasureSpec(this.pss, ErrorDialogData.SUPPRESSED));
        this.psb.measure(MeasureSpec.makeMeasureSpec(this.psr, ErrorDialogData.SUPPRESSED), MeasureSpec.makeMeasureSpec(this.pss, ErrorDialogData.SUPPRESSED));
        this.psc.measure(MeasureSpec.makeMeasureSpec(this.psr, ErrorDialogData.SUPPRESSED), MeasureSpec.makeMeasureSpec(this.pss, ErrorDialogData.SUPPRESSED));
        this.psd.measure(MeasureSpec.makeMeasureSpec(this.psr, ErrorDialogData.SUPPRESSED), MeasureSpec.makeMeasureSpec(this.pss, ErrorDialogData.SUPPRESSED));
        this.prU.measure(MeasureSpec.makeMeasureSpec(this.psr, ErrorDialogData.SUPPRESSED), MeasureSpec.makeMeasureSpec(this.pss, ErrorDialogData.SUPPRESSED));
        this.pse.measure(MeasureSpec.makeMeasureSpec(this.psr, ErrorDialogData.SUPPRESSED), MeasureSpec.makeMeasureSpec(this.pss, ErrorDialogData.SUPPRESSED));
        this.psf.measure(MeasureSpec.makeMeasureSpec(this.psp, ErrorDialogData.SUPPRESSED), MeasureSpec.makeMeasureSpec(1, ErrorDialogData.SUPPRESSED));
        this.psg.measure(MeasureSpec.makeMeasureSpec(this.psp, ErrorDialogData.SUPPRESSED), MeasureSpec.makeMeasureSpec(1, ErrorDialogData.SUPPRESSED));
        this.psh.measure(MeasureSpec.makeMeasureSpec(this.psp, ErrorDialogData.SUPPRESSED), MeasureSpec.makeMeasureSpec(1, ErrorDialogData.SUPPRESSED));
        this.psi.measure(MeasureSpec.makeMeasureSpec(this.psp, ErrorDialogData.SUPPRESSED), MeasureSpec.makeMeasureSpec(1, ErrorDialogData.SUPPRESSED));
        this.psj.measure(MeasureSpec.makeMeasureSpec(1, ErrorDialogData.SUPPRESSED), MeasureSpec.makeMeasureSpec(this.psq, ErrorDialogData.SUPPRESSED));
        this.psk.measure(MeasureSpec.makeMeasureSpec(1, ErrorDialogData.SUPPRESSED), MeasureSpec.makeMeasureSpec(this.psq, ErrorDialogData.SUPPRESSED));
        AppMethodBeat.m2505o(24048);
    }

    public void onClick(View view) {
        AppMethodBeat.m2504i(24049);
        if (!this.psl) {
            C4990ab.m7410d("MicroMsg.Facing.MMKeyBoardView", "onClick KeyBoard is disable.");
            AppMethodBeat.m2505o(24049);
        } else if (view == this.prU) {
            input(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            AppMethodBeat.m2505o(24049);
        } else if (view == this.prV) {
            input("1");
            AppMethodBeat.m2505o(24049);
        } else if (view == this.prW) {
            input("2");
            AppMethodBeat.m2505o(24049);
        } else if (view == this.prX) {
            input(TMQQDownloaderOpenSDKConst.VERIFYTYPE_ALL);
            AppMethodBeat.m2505o(24049);
        } else if (view == this.prY) {
            input("4");
            AppMethodBeat.m2505o(24049);
        } else if (view == this.prZ) {
            input("5");
            AppMethodBeat.m2505o(24049);
        } else if (view == this.psa) {
            input("6");
            AppMethodBeat.m2505o(24049);
        } else if (view == this.psb) {
            input("7");
            AppMethodBeat.m2505o(24049);
        } else if (view == this.psc) {
            input("8");
            AppMethodBeat.m2505o(24049);
        } else if (view == this.psd) {
            input("9");
            AppMethodBeat.m2505o(24049);
        } else {
            if (view == this.pse && this.prB != null && this.psl) {
                this.prB.delete();
            }
            AppMethodBeat.m2505o(24049);
        }
    }

    public boolean onLongClick(View view) {
        AppMethodBeat.m2504i(24050);
        if (view == this.pse && this.prB != null && this.psl) {
            this.prB.axQ();
        }
        AppMethodBeat.m2505o(24050);
        return false;
    }

    public void setKeyBoardEnable(boolean z) {
        AppMethodBeat.m2504i(24051);
        this.psl = z;
        this.prU.setEnabled(z);
        this.prV.setEnabled(z);
        this.prW.setEnabled(z);
        this.prX.setEnabled(z);
        this.prY.setEnabled(z);
        this.prZ.setEnabled(z);
        this.psa.setEnabled(z);
        this.psb.setEnabled(z);
        this.psc.setEnabled(z);
        this.psd.setEnabled(z);
        this.pse.setEnabled(z);
        AppMethodBeat.m2505o(24051);
    }

    public void setOnInputDeleteListener(C21513a c21513a) {
        this.prB = c21513a;
    }

    private void input(String str) {
        AppMethodBeat.m2504i(24052);
        if (this.prB != null && this.psl) {
            this.prB.input(str);
        }
        AppMethodBeat.m2505o(24052);
    }
}
