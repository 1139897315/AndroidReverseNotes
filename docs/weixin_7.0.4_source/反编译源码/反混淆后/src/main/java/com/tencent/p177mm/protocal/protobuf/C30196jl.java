package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.jl */
public final class C30196jl extends btd {
    public int vEq;
    public asq vLi;
    public asr vLj;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(28344);
        C6092b c6092b;
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(28344);
                throw c6092b;
            } else if (this.vLi == null) {
                c6092b = new C6092b("Not all required fields were included: HardDevice");
                AppMethodBeat.m2505o(28344);
                throw c6092b;
            } else if (this.vLj == null) {
                c6092b = new C6092b("Not all required fields were included: HardDeviceAttr");
                AppMethodBeat.m2505o(28344);
                throw c6092b;
            } else {
                if (this.BaseResponse != null) {
                    c6093a.mo13479iy(1, this.BaseResponse.computeSize());
                    this.BaseResponse.writeFields(c6093a);
                }
                if (this.vLi != null) {
                    c6093a.mo13479iy(2, this.vLi.computeSize());
                    this.vLi.writeFields(c6093a);
                }
                if (this.vLj != null) {
                    c6093a.mo13479iy(3, this.vLj.computeSize());
                    this.vLj.writeFields(c6093a);
                }
                c6093a.mo13480iz(4, this.vEq);
                AppMethodBeat.m2505o(28344);
                return 0;
            }
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = C6087a.m9557ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.vLi != null) {
                ix += C6087a.m9557ix(2, this.vLi.computeSize());
            }
            if (this.vLj != null) {
                ix += C6087a.m9557ix(3, this.vLj.computeSize());
            }
            int bs = ix + C6091a.m9572bs(4, this.vEq);
            AppMethodBeat.m2505o(28344);
            return bs;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(28344);
                throw c6092b;
            } else if (this.vLi == null) {
                c6092b = new C6092b("Not all required fields were included: HardDevice");
                AppMethodBeat.m2505o(28344);
                throw c6092b;
            } else if (this.vLj == null) {
                c6092b = new C6092b("Not all required fields were included: HardDeviceAttr");
                AppMethodBeat.m2505o(28344);
                throw c6092b;
            } else {
                AppMethodBeat.m2505o(28344);
                return 0;
            }
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C30196jl c30196jl = (C30196jl) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            C6086a c6086a3;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(c6086a3, baseResponse, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c30196jl.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.m2505o(28344);
                    return 0;
                case 2:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        asq asq = new asq();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = asq.populateBuilderWithField(c6086a3, asq, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c30196jl.vLi = asq;
                    }
                    AppMethodBeat.m2505o(28344);
                    return 0;
                case 3:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        asr asr = new asr();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = asr.populateBuilderWithField(c6086a3, asr, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c30196jl.vLj = asr;
                    }
                    AppMethodBeat.m2505o(28344);
                    return 0;
                case 4:
                    c30196jl.vEq = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(28344);
                    return 0;
                default:
                    AppMethodBeat.m2505o(28344);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(28344);
            return -1;
        }
    }
}
