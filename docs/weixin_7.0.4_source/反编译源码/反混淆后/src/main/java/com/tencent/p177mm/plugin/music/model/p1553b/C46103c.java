package com.tencent.p177mm.plugin.music.model.p1553b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.network.C1902e;
import com.tencent.p177mm.network.C1918k;
import com.tencent.p177mm.network.C1929q;
import com.tencent.p177mm.p183ai.C1202f;
import com.tencent.p177mm.p183ai.C1207m;
import com.tencent.p177mm.p183ai.C7472b;
import com.tencent.p177mm.p183ai.C7472b.C1196a;
import com.tencent.p177mm.protocal.protobuf.aoa;
import com.tencent.p177mm.protocal.protobuf.aob;
import com.tencent.p177mm.sdk.platformtools.C4990ab;

/* renamed from: com.tencent.mm.plugin.music.model.b.c */
public final class C46103c extends C1207m implements C1918k {
    private C1202f ehi;
    private C7472b fAT;
    private aoa oMI;
    public String oMJ = "";
    public String playUrl = "";

    public C46103c(String str) {
        AppMethodBeat.m2504i(104968);
        C1196a c1196a = new C1196a();
        c1196a.fsI = 769;
        c1196a.uri = "/cgi-bin/micromsg-bin/getshakemusicurl";
        c1196a.fsJ = new aoa();
        c1196a.fsK = new aob();
        this.fAT = c1196a.acD();
        this.oMI = (aoa) this.fAT.fsG.fsP;
        this.oMI.wsy = str;
        this.playUrl = str;
        C4990ab.m7417i("MicroMsg.Music.NetSceneGetShakeMusicUrl", "request music url:%s", str);
        AppMethodBeat.m2505o(104968);
    }

    public final int getType() {
        return 769;
    }

    /* renamed from: a */
    public final int mo4456a(C1902e c1902e, C1202f c1202f) {
        AppMethodBeat.m2504i(104969);
        this.ehi = c1202f;
        int a = mo4457a(c1902e, this.fAT, this);
        AppMethodBeat.m2505o(104969);
        return a;
    }

    /* renamed from: a */
    public final void mo4498a(int i, int i2, int i3, String str, C1929q c1929q, byte[] bArr) {
        AppMethodBeat.m2504i(104970);
        C4990ab.m7417i("MicroMsg.Music.NetSceneGetShakeMusicUrl", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            aob aob = (aob) this.fAT.fsH.fsP;
            this.ehi.onSceneEnd(i2, i3, str, this);
            if (aob != null) {
                this.oMJ = aob.wsy;
                C4990ab.m7417i("MicroMsg.Music.NetSceneGetShakeMusicUrl", "tempPlayUrl:%s", this.oMJ);
                AppMethodBeat.m2505o(104970);
                return;
            }
            C4990ab.m7412e("MicroMsg.Music.NetSceneGetShakeMusicUrl", "response is null");
            AppMethodBeat.m2505o(104970);
            return;
        }
        this.ehi.onSceneEnd(i2, i3, str, this);
        AppMethodBeat.m2505o(104970);
    }
}
