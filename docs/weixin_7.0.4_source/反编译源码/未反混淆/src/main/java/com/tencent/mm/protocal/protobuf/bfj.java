package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class bfj extends a {
    public b vKc;
    public int wJh;
    public String wJi;
    public SKBuiltinBuffer_t wJj;
    public int wJk;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(28562);
        e.a.a.b bVar;
        int bs;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.wJj == null) {
                bVar = new e.a.a.b("Not all required fields were included: ClientKey");
                AppMethodBeat.o(28562);
                throw bVar;
            }
            aVar.iz(1, this.wJh);
            if (this.vKc != null) {
                aVar.c(2, this.vKc);
            }
            if (this.wJi != null) {
                aVar.e(3, this.wJi);
            }
            if (this.wJj != null) {
                aVar.iy(4, this.wJj.computeSize());
                this.wJj.writeFields(aVar);
            }
            aVar.iz(5, this.wJk);
            AppMethodBeat.o(28562);
            return 0;
        } else if (i == 1) {
            bs = e.a.a.b.b.a.bs(1, this.wJh) + 0;
            if (this.vKc != null) {
                bs += e.a.a.b.b.a.b(2, this.vKc);
            }
            if (this.wJi != null) {
                bs += e.a.a.b.b.a.f(3, this.wJi);
            }
            if (this.wJj != null) {
                bs += e.a.a.a.ix(4, this.wJj.computeSize());
            }
            bs += e.a.a.b.b.a.bs(5, this.wJk);
            AppMethodBeat.o(28562);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (bs = a.getNextFieldNumber(aVar2); bs > 0; bs = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, bs)) {
                    aVar2.ems();
                }
            }
            if (this.wJj == null) {
                bVar = new e.a.a.b("Not all required fields were included: ClientKey");
                AppMethodBeat.o(28562);
                throw bVar;
            }
            AppMethodBeat.o(28562);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            bfj bfj = (bfj) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    bfj.wJh = aVar3.BTU.vd();
                    AppMethodBeat.o(28562);
                    return 0;
                case 2:
                    bfj.vKc = aVar3.BTU.emu();
                    AppMethodBeat.o(28562);
                    return 0;
                case 3:
                    bfj.wJi = aVar3.BTU.readString();
                    AppMethodBeat.o(28562);
                    return 0;
                case 4:
                    LinkedList Vh = aVar3.Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        SKBuiltinBuffer_t sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = sKBuiltinBuffer_t.populateBuilderWithField(aVar4, sKBuiltinBuffer_t, a.getNextFieldNumber(aVar4))) {
                        }
                        bfj.wJj = sKBuiltinBuffer_t;
                    }
                    AppMethodBeat.o(28562);
                    return 0;
                case 5:
                    bfj.wJk = aVar3.BTU.vd();
                    AppMethodBeat.o(28562);
                    return 0;
                default:
                    AppMethodBeat.o(28562);
                    return -1;
            }
        } else {
            AppMethodBeat.o(28562);
            return -1;
        }
    }
}
