package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.bqc */
public final class bqc extends C1331a {
    public int type;
    public big wSn;
    public C40513dn wSo;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(134438);
        int bs;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            c6093a.mo13480iz(1, this.type);
            if (this.wSn != null) {
                c6093a.mo13479iy(2, this.wSn.computeSize());
                this.wSn.writeFields(c6093a);
            }
            if (this.wSo != null) {
                c6093a.mo13479iy(3, this.wSo.computeSize());
                this.wSo.writeFields(c6093a);
            }
            AppMethodBeat.m2505o(134438);
            return 0;
        } else if (i == 1) {
            bs = C6091a.m9572bs(1, this.type) + 0;
            if (this.wSn != null) {
                bs += C6087a.m9557ix(2, this.wSn.computeSize());
            }
            if (this.wSo != null) {
                bs += C6087a.m9557ix(3, this.wSo.computeSize());
            }
            AppMethodBeat.m2505o(134438);
            return bs;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (bs = C1331a.getNextFieldNumber(c6086a); bs > 0; bs = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, bs)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(134438);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            bqc bqc = (bqc) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            C6086a c6086a3;
            boolean z;
            switch (intValue) {
                case 1:
                    bqc.type = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(134438);
                    return 0;
                case 2:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        big big = new big();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = big.populateBuilderWithField(c6086a3, big, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        bqc.wSn = big;
                    }
                    AppMethodBeat.m2505o(134438);
                    return 0;
                case 3:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C40513dn c40513dn = new C40513dn();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = c40513dn.populateBuilderWithField(c6086a3, c40513dn, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        bqc.wSo = c40513dn;
                    }
                    AppMethodBeat.m2505o(134438);
                    return 0;
                default:
                    AppMethodBeat.m2505o(134438);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(134438);
            return -1;
        }
    }
}
