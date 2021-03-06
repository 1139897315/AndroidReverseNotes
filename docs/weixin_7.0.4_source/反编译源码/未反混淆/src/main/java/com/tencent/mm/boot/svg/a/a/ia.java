package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class ia extends c {
    private final int height = 54;
    private final int width = 54;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 54;
            case 1:
                return 54;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                c.h(looper);
                c.g(looper);
                Paint k = c.k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                c.a(k2, looper).setStrokeWidth(1.0f);
                Paint a = c.a(k, looper);
                a.setColor(-1);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path l = c.l(looper);
                l.moveTo(0.0f, 0.0f);
                l.lineTo(26.0f, 0.0f);
                l.cubicTo(12.509529f, 0.49329123f, 0.7483469f, 11.8685875f, 0.0f, 25.0f);
                l.lineTo(0.0f, 0.0f);
                l.lineTo(0.0f, 0.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                l = c.l(looper);
                l.moveTo(29.0f, 0.0f);
                l.lineTo(54.0f, 0.0f);
                l.lineTo(54.0f, 26.0f);
                l.cubicTo(53.497437f, 12.4941635f, 42.12574f, 0.7385214f, 29.0f, 0.0f);
                l.lineTo(29.0f, 0.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                l = c.l(looper);
                l.moveTo(21.43654f, 3.717582f);
                l.cubicTo(32.972836f, 0.6226771f, 45.939915f, 7.864154f, 49.611916f, 19.18209f);
                l.cubicTo(53.0638f, 28.296535f, 49.862053f, 39.253902f, 42.39798f, 45.40365f);
                l.cubicTo(32.812748f, 53.94719f, 16.643925f, 52.5049f, 8.659567f, 42.468998f);
                l.cubicTo(3.5167596f, 36.36933f, 1.5556893f, 27.595425f, 4.127093f, 19.973345f);
                l.cubicTo(6.498387f, 11.990694f, 13.352127f, 5.6205983f, 21.43654f, 3.717582f);
                l.lineTo(21.43654f, 3.717582f);
                l.close();
                l.moveTo(21.829847f, 14.14869f);
                l.cubicTo(18.914087f, 15.684807f, 18.011591f, 19.130964f, 17.585136f, 22.19309f);
                l.lineTo(20.88768f, 22.19309f);
                l.cubicTo(21.353806f, 20.303263f, 21.552156f, 17.999088f, 23.386904f, 16.917742f);
                l.cubicTo(26.253077f, 14.825794f, 31.519297f, 16.46297f, 31.291193f, 20.535702f);
                l.cubicTo(31.42012f, 24.274933f, 27.463018f, 25.437128f, 24.517504f, 25.447233f);
                l.cubicTo(24.507587f, 26.083914f, 24.487751f, 27.357273f, 24.477835f, 28.004059f);
                l.cubicTo(27.691122f, 27.781727f, 32.015175f, 28.701376f, 32.372208f, 32.652836f);
                l.cubicTo(33.225117f, 36.89737f, 28.484526f, 39.979706f, 24.765444f, 38.817513f);
                l.cubicTo(21.839766f, 38.382954f, 20.76867f, 35.320827f, 20.28271f, 32.753895f);
                l.cubicTo(19.181862f, 32.753895f, 18.09093f, 32.753895f, 17.0f, 32.764f);
                l.cubicTo(17.32728f, 35.43199f, 17.902496f, 38.39306f, 20.20337f, 40.05045f);
                l.cubicTo(24.071215f, 42.84982f, 30.011827f, 42.637592f, 33.57223f, 39.39356f);
                l.cubicTo(37.49958f, 35.704857f, 36.65659f, 27.801939f, 31.082924f, 26.316353f);
                l.cubicTo(33.23503f, 24.800447f, 35.525986f, 22.546803f, 34.722664f, 19.585735f);
                l.cubicTo(34.33588f, 13.380631f, 26.44151f, 11.541333f, 21.829847f, 14.14869f);
                l.lineTo(21.829847f, 14.14869f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                l = c.l(looper);
                l.moveTo(0.0f, 28.0f);
                l.cubicTo(0.5033557f, 41.49572f, 11.873273f, 53.241245f, 25.0f, 54.0f);
                l.lineTo(0.0f, 54.0f);
                l.lineTo(0.0f, 28.0f);
                l.lineTo(0.0f, 28.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a = c.a(a, looper);
                l = c.l(looper);
                l.moveTo(28.0f, 54.0f);
                l.cubicTo(41.500584f, 53.5071f, 53.261765f, 42.121056f, 54.0f, 29.0f);
                l.lineTo(54.0f, 54.0f);
                l.lineTo(28.0f, 54.0f);
                l.lineTo(28.0f, 54.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                k = c.a(k, looper);
                k.setColor(-16139513);
                canvas.save();
                a = c.a(k, looper);
                l = c.l(looper);
                l.moveTo(25.71f, 0.0f);
                l.lineTo(28.63f, 0.0f);
                l.cubicTo(41.95f, 0.73f, 53.49f, 12.35f, 54.0f, 25.7f);
                l.lineTo(54.0f, 28.64f);
                l.cubicTo(53.27f, 41.95f, 41.64f, 53.5f, 28.29f, 54.0f);
                l.lineTo(25.33f, 54.0f);
                l.cubicTo(12.03f, 53.25f, 0.51f, 41.64f, 0.0f, 28.3f);
                l.lineTo(0.0f, 25.34f);
                l.cubicTo(0.74f, 12.03f, 12.37f, 0.5f, 25.71f, 0.0f);
                l.lineTo(25.71f, 0.0f);
                l.close();
                l.moveTo(21.43654f, 3.717582f);
                l.cubicTo(13.352127f, 5.6205983f, 6.498387f, 11.990694f, 4.127093f, 19.973345f);
                l.cubicTo(1.5556893f, 27.595425f, 3.5167596f, 36.36933f, 8.659567f, 42.468998f);
                l.cubicTo(16.643925f, 52.5049f, 32.812748f, 53.94719f, 42.39798f, 45.40365f);
                l.cubicTo(49.862053f, 39.253902f, 53.0638f, 28.296535f, 49.611916f, 19.18209f);
                l.cubicTo(45.939915f, 7.864154f, 32.972836f, 0.6226771f, 21.43654f, 3.717582f);
                l.lineTo(21.43654f, 3.717582f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                k = c.a(k, looper);
                l = c.l(looper);
                l.moveTo(21.829847f, 14.14869f);
                l.cubicTo(26.44151f, 11.541333f, 34.33588f, 13.380631f, 34.722664f, 19.585735f);
                l.cubicTo(35.525986f, 22.546803f, 33.23503f, 24.800447f, 31.082924f, 26.316353f);
                l.cubicTo(36.65659f, 27.801939f, 37.49958f, 35.704857f, 33.57223f, 39.39356f);
                l.cubicTo(30.011827f, 42.637592f, 24.071215f, 42.84982f, 20.20337f, 40.05045f);
                l.cubicTo(17.902496f, 38.39306f, 17.32728f, 35.43199f, 17.0f, 32.764f);
                l.cubicTo(18.09093f, 32.753895f, 19.181862f, 32.753895f, 20.28271f, 32.753895f);
                l.cubicTo(20.76867f, 35.320827f, 21.839766f, 38.382954f, 24.765444f, 38.817513f);
                l.cubicTo(28.484526f, 39.979706f, 33.225117f, 36.89737f, 32.372208f, 32.652836f);
                l.cubicTo(32.015175f, 28.701376f, 27.691122f, 27.781727f, 24.477835f, 28.004059f);
                l.cubicTo(24.487751f, 27.357273f, 24.507587f, 26.083914f, 24.517504f, 25.447233f);
                l.cubicTo(27.463018f, 25.437128f, 31.42012f, 24.274933f, 31.291193f, 20.535702f);
                l.cubicTo(31.519297f, 16.46297f, 26.253077f, 14.825794f, 23.386904f, 16.917742f);
                l.cubicTo(21.552156f, 17.999088f, 21.353806f, 20.303263f, 20.88768f, 22.19309f);
                l.lineTo(17.585136f, 22.19309f);
                l.cubicTo(18.011591f, 19.130964f, 18.914087f, 15.684807f, 21.829847f, 14.14869f);
                l.lineTo(21.829847f, 14.14869f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, k);
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
