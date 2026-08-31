.class public final Lcom/web2native/MainActivity;
.super Lh/h;
.source "SourceFile"


# static fields
.field public static final synthetic U:I


# instance fields
.field public Q:LR4/k1;

.field public R:Lj5/c;

.field public final S:Z

.field public T:Lcom/web2native/NotificationDisableBroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lh/h;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lb/l;->t:LZ/m;

    .line 5
    .line 6
    iget-object v0, v0, LZ/m;->s:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LZ/m;

    .line 9
    .line 10
    new-instance v1, Lg2/a;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lg2/a;-><init>(Lcom/web2native/MainActivity;)V

    .line 13
    .line 14
    .line 15
    const-string v2, "androidx:appcompat"

    .line 16
    .line 17
    invoke-virtual {v0, v2, v1}, LZ/m;->C(Ljava/lang/String;Lg2/d;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lh/g;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Lh/g;-><init>(Lcom/web2native/MainActivity;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lb/l;->i(Ld/a;)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    iput-boolean v0, p0, Lcom/web2native/MainActivity;->S:Z

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 5

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/web2native/MainActivity;->S:Z

    .line 7
    .line 8
    if-eqz v0, :cond_6

    .line 9
    .line 10
    iget-object v0, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const-string v2, "dataObject"

    .line 14
    .line 15
    if-eqz v0, :cond_5

    .line 16
    .line 17
    iget-object v0, v0, LR4/k1;->d:LR4/i;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, v0, LR4/i;->M:Ljava/lang/Boolean;

    .line 22
    .line 23
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-static {v0, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    :goto_0
    if-eqz v0, :cond_6

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/16 v3, 0x18

    .line 38
    .line 39
    if-eq v0, v3, :cond_1

    .line 40
    .line 41
    const/16 v4, 0x19

    .line 42
    .line 43
    if-eq v0, v4, :cond_1

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_4

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-ne p1, v3, :cond_2

    .line 57
    .line 58
    const-string p1, "window.volumeEventCallback(\'VOLUME_UP_PRESSED\')"

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    const-string p1, "window.volumeEventCallback(\'VOLUME_DOWN_PRESSED\')"

    .line 62
    .line 63
    :goto_1
    iget-object v0, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    iget-object v0, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 68
    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    new-instance v1, LR4/i1;

    .line 72
    .line 73
    invoke-direct {v1, p0, p1}, LR4/i1;-><init>(Lcom/web2native/MainActivity;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string p1, "typeof volumeEventCallback === \'function\'"

    .line 77
    .line 78
    invoke-virtual {v0, p1, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v1

    .line 86
    :cond_4
    :goto_2
    const/4 p1, 0x1

    .line 87
    return p1

    .line 88
    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v1

    .line 92
    :cond_6
    :goto_3
    invoke-super {p0, p1}, Lh/h;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    return p1
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 6

    .line 1
    const/16 v0, 0x119

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const-string v2, "dataObject"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    if-ne p1, v0, :cond_2

    .line 8
    .line 9
    if-ne p2, v1, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, v0, LR4/k1;->G:LR4/V;

    .line 16
    .line 17
    if-eqz v0, :cond_8

    .line 18
    .line 19
    if-eqz p3, :cond_8

    .line 20
    .line 21
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_8

    .line 26
    .line 27
    iget-object v4, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 28
    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-virtual {v4, v0, v5}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v3

    .line 44
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v3

    .line 48
    :cond_2
    iget-object v0, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 49
    .line 50
    if-eqz v0, :cond_18

    .line 51
    .line 52
    iget v4, v0, LR4/k1;->f0:I

    .line 53
    .line 54
    if-ne p1, v4, :cond_3

    .line 55
    .line 56
    if-eqz p3, :cond_8

    .line 57
    .line 58
    sget-object v0, LR4/V;->d:LR4/V;

    .line 59
    .line 60
    if-nez v0, :cond_8

    .line 61
    .line 62
    new-instance v0, LR4/V;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    sput-object v0, LR4/V;->d:LR4/V;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    iget-object v4, v0, LR4/k1;->F:LR4/V;

    .line 71
    .line 72
    if-eqz v4, :cond_4

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    iget v4, v0, LR4/k1;->g0:I

    .line 76
    .line 77
    if-ne p1, v4, :cond_5

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_5
    iget v0, v0, LR4/k1;->d0:I

    .line 81
    .line 82
    if-ne p1, v0, :cond_8

    .line 83
    .line 84
    if-ne p2, v1, :cond_8

    .line 85
    .line 86
    if-eqz p3, :cond_6

    .line 87
    .line 88
    const-string v0, "android.speech.extra.RESULTS"

    .line 89
    .line 90
    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    goto :goto_0

    .line 95
    :cond_6
    move-object v0, v3

    .line 96
    :goto_0
    new-instance v4, Lorg/json/JSONArray;

    .line 97
    .line 98
    invoke-direct {v4, v0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 99
    .line 100
    .line 101
    new-instance v0, Lorg/json/JSONObject;

    .line 102
    .line 103
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 104
    .line 105
    .line 106
    const-string v5, "results"

    .line 107
    .line 108
    invoke-virtual {v0, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 109
    .line 110
    .line 111
    const-string v4, "success"

    .line 112
    .line 113
    const/4 v5, 0x1

    .line 114
    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 115
    .line 116
    .line 117
    const-string v4, "type"

    .line 118
    .line 119
    const-string v5, "VOICE_SEARCH_RESULT"

    .line 120
    .line 121
    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 122
    .line 123
    .line 124
    iget-object v4, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 125
    .line 126
    if-eqz v4, :cond_7

    .line 127
    .line 128
    iget-object v4, v4, LR4/k1;->H:LR4/l3;

    .line 129
    .line 130
    if-eqz v4, :cond_8

    .line 131
    .line 132
    invoke-virtual {v4, v0}, LR4/l3;->doneVoiceSearch(Lorg/json/JSONObject;)V

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw v3

    .line 140
    :cond_8
    :goto_1
    const/16 v0, 0x17

    .line 141
    .line 142
    if-ne p1, v0, :cond_17

    .line 143
    .line 144
    if-ne p2, v1, :cond_15

    .line 145
    .line 146
    iget-object v0, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 147
    .line 148
    if-eqz v0, :cond_14

    .line 149
    .line 150
    iget-object v0, v0, LR4/k1;->o:Ljava/lang/String;

    .line 151
    .line 152
    if-eqz v0, :cond_17

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    const v4, -0x7b367aca

    .line 159
    .line 160
    .line 161
    const-string v5, "data"

    .line 162
    .line 163
    if-eq v1, v4, :cond_10

    .line 164
    .line 165
    const v4, -0x3180eef7

    .line 166
    .line 167
    .line 168
    if-eq v1, v4, :cond_d

    .line 169
    .line 170
    const v4, 0x3036c529

    .line 171
    .line 172
    .line 173
    if-eq v1, v4, :cond_9

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_9
    const-string v1, "unpairDevice"

    .line 177
    .line 178
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-nez v0, :cond_a

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_a
    iget-object v0, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 186
    .line 187
    if-eqz v0, :cond_c

    .line 188
    .line 189
    iget-object v0, v0, LR4/k1;->i0:LR4/V;

    .line 190
    .line 191
    if-nez v0, :cond_b

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_b
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-static {v3, v5}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw v3

    .line 201
    :cond_c
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    throw v3

    .line 205
    :cond_d
    const-string v1, "startBluetoothScan"

    .line 206
    .line 207
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-nez v0, :cond_e

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_e
    iget-object v0, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 215
    .line 216
    if-eqz v0, :cond_f

    .line 217
    .line 218
    iget-object v0, v0, LR4/k1;->i0:LR4/V;

    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_f
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw v3

    .line 225
    :cond_10
    const-string v1, "pairWithDevice"

    .line 226
    .line 227
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-nez v0, :cond_11

    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_11
    iget-object v0, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 235
    .line 236
    if-eqz v0, :cond_13

    .line 237
    .line 238
    iget-object v0, v0, LR4/k1;->i0:LR4/V;

    .line 239
    .line 240
    if-nez v0, :cond_12

    .line 241
    .line 242
    goto :goto_2

    .line 243
    :cond_12
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    invoke-static {v3, v5}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    throw v3

    .line 250
    :cond_13
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    throw v3

    .line 254
    :cond_14
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    throw v3

    .line 258
    :cond_15
    iget-object v0, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 259
    .line 260
    if-eqz v0, :cond_16

    .line 261
    .line 262
    iget-object v1, v0, LR4/k1;->o:Ljava/lang/String;

    .line 263
    .line 264
    if-nez v1, :cond_17

    .line 265
    .line 266
    const-string v1, "checkBluetoothPermission"

    .line 267
    .line 268
    iput-object v1, v0, LR4/k1;->o:Ljava/lang/String;

    .line 269
    .line 270
    goto :goto_2

    .line 271
    :cond_16
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    throw v3

    .line 275
    :cond_17
    :goto_2
    invoke-super {p0, p1, p2, p3}, Lh/h;->onActivityResult(IILandroid/content/Intent;)V

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :cond_18
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    throw v3
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    const-string v0, "newConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lh/h;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 7
    .line 8
    .line 9
    iget-boolean v0, p0, Lcom/web2native/MainActivity;->S:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/web2native/MainActivity;->R:Lj5/c;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, v0, Lj5/c;->b:Landroidx/lifecycle/J;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroidx/lifecycle/G;->k(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    invoke-super/range {p0 .. p1}, Lh/h;->onCreate(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v3, 0x1f

    .line 11
    .line 12
    if-lt v0, v3, :cond_0

    .line 13
    .line 14
    new-instance v3, Lt1/b;

    .line 15
    .line 16
    invoke-direct {v3, v1}, Lt1/b;-><init>(Lcom/web2native/MainActivity;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v3, LR4/U;

    .line 21
    .line 22
    invoke-direct {v3, v1}, LR4/U;-><init>(Lcom/web2native/MainActivity;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {v3}, LR4/U;->a()V

    .line 26
    .line 27
    .line 28
    iget-boolean v3, v1, Lcom/web2native/MainActivity;->S:Z

    .line 29
    .line 30
    if-eqz v3, :cond_43

    .line 31
    .line 32
    new-instance v3, LR4/k1;

    .line 33
    .line 34
    invoke-direct {v3, v1, v1}, LR4/k1;-><init>(Lcom/web2native/MainActivity;Lcom/web2native/MainActivity;)V

    .line 35
    .line 36
    .line 37
    iput-object v3, v1, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    iget-object v3, v3, LR4/k1;->d:LR4/i;

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    iget-object v3, v3, LR4/i;->O:Ljava/lang/String;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object v3, v4

    .line 48
    :goto_1
    const-string v5, "PORTRAIT"

    .line 49
    .line 50
    invoke-static {v3, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    const/4 v5, 0x1

    .line 55
    const/4 v6, 0x0

    .line 56
    const-string v7, "dataObject"

    .line 57
    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    invoke-virtual {v1, v5}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 61
    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_2
    iget-object v3, v1, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 65
    .line 66
    if-eqz v3, :cond_42

    .line 67
    .line 68
    iget-object v3, v3, LR4/k1;->d:LR4/i;

    .line 69
    .line 70
    if-eqz v3, :cond_3

    .line 71
    .line 72
    iget-object v3, v3, LR4/i;->O:Ljava/lang/String;

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    move-object v3, v4

    .line 76
    :goto_2
    const-string v8, "LANDSCAPE"

    .line 77
    .line 78
    invoke-static {v3, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_4

    .line 83
    .line 84
    invoke-virtual {v1, v6}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_4
    const/4 v3, -0x1

    .line 89
    invoke-virtual {v1, v3}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 90
    .line 91
    .line 92
    :goto_3
    const-string v3, "android.permission.POST_NOTIFICATIONS"

    .line 93
    .line 94
    invoke-static {v1, v3}, Lk1/c;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    const/16 v8, 0x21

    .line 99
    .line 100
    if-nez v3, :cond_6

    .line 101
    .line 102
    if-lt v0, v8, :cond_6

    .line 103
    .line 104
    iget-object v3, v1, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 105
    .line 106
    if-eqz v3, :cond_5

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_5
    invoke-static {v7}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v4

    .line 113
    :cond_6
    if-ge v0, v8, :cond_8

    .line 114
    .line 115
    iget-object v3, v1, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 116
    .line 117
    if-eqz v3, :cond_7

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_7
    invoke-static {v7}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw v4

    .line 124
    :cond_8
    :goto_4
    iget-object v3, v1, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 125
    .line 126
    if-eqz v3, :cond_41

    .line 127
    .line 128
    iput-object v2, v3, LR4/k1;->r:Landroid/os/Bundle;

    .line 129
    .line 130
    new-instance v3, Lj5/c;

    .line 131
    .line 132
    invoke-direct {v3}, Lj5/c;-><init>()V

    .line 133
    .line 134
    .line 135
    iput-object v3, v1, Lcom/web2native/MainActivity;->R:Lj5/c;

    .line 136
    .line 137
    iget-object v9, v1, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 138
    .line 139
    if-eqz v9, :cond_40

    .line 140
    .line 141
    iput-object v3, v9, LR4/k1;->s:Lj5/c;

    .line 142
    .line 143
    new-instance v3, LR4/s0;

    .line 144
    .line 145
    invoke-direct {v3, v1, v9, v5}, LR4/s0;-><init>(Lcom/web2native/MainActivity;LR4/k1;I)V

    .line 146
    .line 147
    .line 148
    iget-object v3, v1, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 149
    .line 150
    if-eqz v3, :cond_3f

    .line 151
    .line 152
    new-instance v9, LR4/V;

    .line 153
    .line 154
    iget-object v10, v3, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 155
    .line 156
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 157
    .line 158
    .line 159
    iput-object v9, v3, LR4/k1;->B:LR4/V;

    .line 160
    .line 161
    new-instance v9, Lk3/c;

    .line 162
    .line 163
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 164
    .line 165
    .line 166
    new-instance v11, Lk3/d;

    .line 167
    .line 168
    const/16 v12, 0x12

    .line 169
    .line 170
    invoke-direct {v11, v12, v6}, Lk3/d;-><init>(IZ)V

    .line 171
    .line 172
    .line 173
    invoke-static {v10}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    iput-object v10, v11, Lk3/d;->r:Ljava/lang/Object;

    .line 178
    .line 179
    iput-object v11, v9, Lk3/c;->q:Ljava/lang/Object;

    .line 180
    .line 181
    iput-object v9, v3, LR4/k1;->C:Lk3/c;

    .line 182
    .line 183
    new-instance v9, LR4/V;

    .line 184
    .line 185
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 186
    .line 187
    .line 188
    iput-object v9, v3, LR4/k1;->F:LR4/V;

    .line 189
    .line 190
    iget-object v9, v3, LR4/k1;->d:LR4/i;

    .line 191
    .line 192
    if-eqz v9, :cond_9

    .line 193
    .line 194
    iget-object v10, v9, LR4/i;->n:LR4/w2;

    .line 195
    .line 196
    if-eqz v10, :cond_9

    .line 197
    .line 198
    iget-object v10, v10, LR4/w2;->a:Ljava/util/List;

    .line 199
    .line 200
    if-eqz v10, :cond_9

    .line 201
    .line 202
    check-cast v10, Ljava/util/Collection;

    .line 203
    .line 204
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 205
    .line 206
    .line 207
    move-result v10

    .line 208
    xor-int/2addr v10, v5

    .line 209
    if-ne v10, v5, :cond_9

    .line 210
    .line 211
    new-instance v10, LB0/o;

    .line 212
    .line 213
    const/16 v11, 0x1b

    .line 214
    .line 215
    invoke-direct {v10, v3, v11}, LB0/o;-><init>(LR4/k1;I)V

    .line 216
    .line 217
    .line 218
    iput-object v10, v3, LR4/k1;->K:LB0/o;

    .line 219
    .line 220
    :cond_9
    iget-object v10, v3, LR4/k1;->l:Lk5/b;

    .line 221
    .line 222
    if-eqz v10, :cond_a

    .line 223
    .line 224
    iget-object v10, v10, Lk5/b;->c:Landroidx/lifecycle/J;

    .line 225
    .line 226
    if-eqz v10, :cond_a

    .line 227
    .line 228
    iget-object v11, v3, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 229
    .line 230
    new-instance v13, LZ4/G;

    .line 231
    .line 232
    const/4 v14, 0x6

    .line 233
    invoke-direct {v13, v14}, LZ4/G;-><init>(I)V

    .line 234
    .line 235
    .line 236
    new-instance v14, LR4/J0;

    .line 237
    .line 238
    const/4 v15, 0x5

    .line 239
    invoke-direct {v14, v13, v15}, LR4/J0;-><init>(LB5/c;I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v10, v11, v14}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 243
    .line 244
    .line 245
    :cond_a
    if-eqz v9, :cond_b

    .line 246
    .line 247
    iget-object v10, v9, LR4/i;->m:LR4/G;

    .line 248
    .line 249
    if-eqz v10, :cond_b

    .line 250
    .line 251
    iget-object v10, v10, LR4/G;->a:Ljava/lang/Boolean;

    .line 252
    .line 253
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 254
    .line 255
    invoke-static {v10, v11}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v10

    .line 259
    goto :goto_5

    .line 260
    :cond_b
    move v10, v6

    .line 261
    :goto_5
    if-eqz v10, :cond_d

    .line 262
    .line 263
    if-eqz v9, :cond_d

    .line 264
    .line 265
    iget-object v10, v9, LR4/i;->m:LR4/G;

    .line 266
    .line 267
    if-eqz v10, :cond_d

    .line 268
    .line 269
    iget-object v10, v10, LR4/G;->b:LR4/D;

    .line 270
    .line 271
    if-eqz v10, :cond_d

    .line 272
    .line 273
    iget-object v10, v10, LR4/D;->b:Ljava/lang/String;

    .line 274
    .line 275
    if-eqz v10, :cond_d

    .line 276
    .line 277
    invoke-static {v10}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 281
    .line 282
    .line 283
    move-result v10

    .line 284
    if-lez v10, :cond_c

    .line 285
    .line 286
    move v10, v5

    .line 287
    goto :goto_6

    .line 288
    :cond_c
    move v10, v6

    .line 289
    :goto_6
    if-eqz v10, :cond_d

    .line 290
    .line 291
    new-instance v10, Lcom/web2native/OrufyConnectHandlerUtil;

    .line 292
    .line 293
    invoke-direct {v10, v3}, Lcom/web2native/OrufyConnectHandlerUtil;-><init>(LR4/k1;)V

    .line 294
    .line 295
    .line 296
    iput-object v10, v3, LR4/k1;->L:Lcom/web2native/OrufyConnectHandlerUtil;

    .line 297
    .line 298
    :cond_d
    iget-object v10, v3, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 299
    .line 300
    iget-object v11, v3, LR4/k1;->d:LR4/i;

    .line 301
    .line 302
    const/16 v13, 0x19

    .line 303
    .line 304
    if-lt v0, v13, :cond_13

    .line 305
    .line 306
    if-eqz v11, :cond_e

    .line 307
    .line 308
    iget-object v0, v11, LR4/i;->j:Ljava/util/List;

    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_e
    move-object v0, v4

    .line 312
    :goto_7
    const-string v13, "getSystemService(...)"

    .line 313
    .line 314
    if-eqz v0, :cond_11

    .line 315
    .line 316
    new-instance v14, Ljava/util/ArrayList;

    .line 317
    .line 318
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 319
    .line 320
    .line 321
    invoke-static {}, LR4/j;->g()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-virtual {v10, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-static {v0, v13}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    invoke-static {v0}, LR4/j;->f(Ljava/lang/Object;)Landroid/content/pm/ShortcutManager;

    .line 333
    .line 334
    .line 335
    move-result-object v13

    .line 336
    if-eqz v11, :cond_f

    .line 337
    .line 338
    iget-object v0, v11, LR4/i;->j:Ljava/util/List;

    .line 339
    .line 340
    goto :goto_8

    .line 341
    :cond_f
    move-object v0, v4

    .line 342
    :goto_8
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    check-cast v0, Ljava/lang/Iterable;

    .line 346
    .line 347
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 348
    .line 349
    .line 350
    move-result-object v11

    .line 351
    :goto_9
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    if-eqz v0, :cond_10

    .line 356
    .line 357
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    move-object v15, v0

    .line 362
    check-cast v15, LR4/G2;

    .line 363
    .line 364
    invoke-static {}, LR4/j;->i()V

    .line 365
    .line 366
    .line 367
    iget-object v0, v15, LR4/G2;->c:Ljava/lang/String;

    .line 368
    .line 369
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v6

    .line 373
    invoke-static {v10, v6}, LR4/j;->d(Lcom/web2native/MainActivity;Ljava/lang/String;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 374
    .line 375
    .line 376
    move-result-object v6

    .line 377
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v8

    .line 381
    invoke-static {v6, v8}, LR4/j;->c(Landroid/content/pm/ShortcutInfo$Builder;Ljava/lang/String;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 382
    .line 383
    .line 384
    move-result-object v6

    .line 385
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-static {v6, v0}, LR4/j;->n(Landroid/content/pm/ShortcutInfo$Builder;Ljava/lang/String;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 390
    .line 391
    .line 392
    move-result-object v6

    .line 393
    iget-object v0, v15, LR4/G2;->b:Ljava/lang/String;

    .line 394
    .line 395
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    :try_start_0
    invoke-virtual {v10}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 400
    .line 401
    .line 402
    move-result-object v8

    .line 403
    invoke-virtual {v8, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    const-string v8, "open(...)"

    .line 408
    .line 409
    invoke-static {v0, v8}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 413
    .line 414
    .line 415
    move-result-object v8

    .line 416
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 417
    .line 418
    .line 419
    goto :goto_a

    .line 420
    :catch_0
    move-exception v0

    .line 421
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 422
    .line 423
    .line 424
    move-object v8, v4

    .line 425
    :goto_a
    invoke-static {v8}, Landroid/graphics/drawable/Icon;->createWithBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-static {v6, v0}, LR4/j;->b(Landroid/content/pm/ShortcutInfo$Builder;Landroid/graphics/drawable/Icon;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    new-instance v6, Landroid/content/Intent;

    .line 434
    .line 435
    const-class v8, Lcom/web2native/MainActivity;

    .line 436
    .line 437
    invoke-direct {v6, v10, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 438
    .line 439
    .line 440
    iget-object v8, v15, LR4/G2;->a:Ljava/lang/String;

    .line 441
    .line 442
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v8

    .line 446
    const-string v15, "openURL"

    .line 447
    .line 448
    invoke-virtual {v6, v15, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 449
    .line 450
    .line 451
    move-result-object v6

    .line 452
    const-string v8, "android.intent.action.VIEW"

    .line 453
    .line 454
    invoke-virtual {v6, v8}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 455
    .line 456
    .line 457
    move-result-object v6

    .line 458
    invoke-static {v0, v6}, LR4/j;->a(Landroid/content/pm/ShortcutInfo$Builder;Landroid/content/Intent;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    invoke-static {v0}, LR4/j;->e(Landroid/content/pm/ShortcutInfo$Builder;)Landroid/content/pm/ShortcutInfo;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    const-string v6, "build(...)"

    .line 467
    .line 468
    invoke-static {v0, v6}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    const/4 v6, 0x0

    .line 475
    const/16 v8, 0x21

    .line 476
    .line 477
    goto :goto_9

    .line 478
    :cond_10
    invoke-static {v13, v14}, LR4/j;->k(Landroid/content/pm/ShortcutManager;Ljava/util/ArrayList;)V

    .line 479
    .line 480
    .line 481
    goto :goto_c

    .line 482
    :cond_11
    if-eqz v11, :cond_12

    .line 483
    .line 484
    iget-object v0, v11, LR4/i;->j:Ljava/util/List;

    .line 485
    .line 486
    goto :goto_b

    .line 487
    :cond_12
    move-object v0, v4

    .line 488
    :goto_b
    if-nez v0, :cond_13

    .line 489
    .line 490
    invoke-static {}, LR4/j;->g()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    invoke-virtual {v10, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-static {v0, v13}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    invoke-static {v0}, LR4/j;->f(Ljava/lang/Object;)Landroid/content/pm/ShortcutManager;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-static {v0}, LR4/j;->h(Landroid/content/pm/ShortcutManager;)Ljava/util/List;

    .line 506
    .line 507
    .line 508
    move-result-object v6

    .line 509
    const-string v8, "getDynamicShortcuts(...)"

    .line 510
    .line 511
    invoke-static {v6, v8}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    check-cast v6, Ljava/util/Collection;

    .line 515
    .line 516
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 517
    .line 518
    .line 519
    move-result v6

    .line 520
    if-nez v6, :cond_13

    .line 521
    .line 522
    invoke-static {v0}, LR4/j;->j(Landroid/content/pm/ShortcutManager;)V

    .line 523
    .line 524
    .line 525
    :cond_13
    :goto_c
    new-instance v0, LR4/l3;

    .line 526
    .line 527
    invoke-direct {v0, v3}, LR4/l3;-><init>(LR4/k1;)V

    .line 528
    .line 529
    .line 530
    iput-object v0, v3, LR4/k1;->H:LR4/l3;

    .line 531
    .line 532
    new-instance v0, LB0/o;

    .line 533
    .line 534
    const/16 v6, 0x1a

    .line 535
    .line 536
    invoke-direct {v0, v3, v6}, LB0/o;-><init>(LR4/k1;I)V

    .line 537
    .line 538
    .line 539
    iput-object v0, v3, LR4/k1;->J:LB0/o;

    .line 540
    .line 541
    iget-object v0, v3, LR4/k1;->k:Landroid/webkit/WebView;

    .line 542
    .line 543
    if-eqz v0, :cond_14

    .line 544
    .line 545
    iget-object v8, v3, LR4/k1;->H:LR4/l3;

    .line 546
    .line 547
    invoke-static {v8}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    const-string v10, "WebToNativeInterface"

    .line 551
    .line 552
    invoke-virtual {v0, v8, v10}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    :cond_14
    if-eqz v9, :cond_15

    .line 556
    .line 557
    iget-object v0, v9, LR4/i;->z:LR4/Y;

    .line 558
    .line 559
    if-eqz v0, :cond_15

    .line 560
    .line 561
    iget-object v0, v0, LR4/Y;->a:Ljava/lang/Boolean;

    .line 562
    .line 563
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 564
    .line 565
    invoke-static {v0, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    move-result v0

    .line 569
    goto :goto_d

    .line 570
    :cond_15
    const/4 v0, 0x0

    .line 571
    :goto_d
    if-eqz v0, :cond_16

    .line 572
    .line 573
    new-instance v0, LR4/V;

    .line 574
    .line 575
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 576
    .line 577
    .line 578
    iput-object v0, v3, LR4/k1;->G:LR4/V;

    .line 579
    .line 580
    :cond_16
    if-eqz v9, :cond_17

    .line 581
    .line 582
    iget-object v0, v9, LR4/i;->B:LR4/z1;

    .line 583
    .line 584
    if-eqz v0, :cond_17

    .line 585
    .line 586
    iget-object v0, v0, LR4/z1;->a:Ljava/lang/Boolean;

    .line 587
    .line 588
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 589
    .line 590
    invoke-static {v0, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    move-result v0

    .line 594
    goto :goto_e

    .line 595
    :cond_17
    const/4 v0, 0x0

    .line 596
    :goto_e
    if-eqz v0, :cond_18

    .line 597
    .line 598
    new-instance v0, LR4/V;

    .line 599
    .line 600
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 601
    .line 602
    .line 603
    iput-object v0, v3, LR4/k1;->j0:LR4/V;

    .line 604
    .line 605
    :cond_18
    if-eqz v9, :cond_19

    .line 606
    .line 607
    iget-object v0, v9, LR4/i;->P:Ljava/lang/Boolean;

    .line 608
    .line 609
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 610
    .line 611
    invoke-static {v0, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 612
    .line 613
    .line 614
    :cond_19
    if-eqz v9, :cond_1a

    .line 615
    .line 616
    iget-object v0, v9, LR4/i;->H:LR4/k2;

    .line 617
    .line 618
    if-eqz v0, :cond_1a

    .line 619
    .line 620
    iget-object v0, v0, LR4/k2;->a:Ljava/lang/Boolean;

    .line 621
    .line 622
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 623
    .line 624
    invoke-static {v0, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 625
    .line 626
    .line 627
    move-result v0

    .line 628
    goto :goto_f

    .line 629
    :cond_1a
    const/4 v0, 0x0

    .line 630
    :goto_f
    if-eqz v0, :cond_1b

    .line 631
    .line 632
    new-instance v0, LR4/V;

    .line 633
    .line 634
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 635
    .line 636
    .line 637
    iput-object v0, v3, LR4/k1;->q:LR4/V;

    .line 638
    .line 639
    :cond_1b
    if-eqz v9, :cond_1c

    .line 640
    .line 641
    iget-object v0, v9, LR4/i;->L:LR4/V2;

    .line 642
    .line 643
    if-eqz v0, :cond_1c

    .line 644
    .line 645
    iget-object v0, v0, LR4/V2;->a:Ljava/lang/Boolean;

    .line 646
    .line 647
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 648
    .line 649
    invoke-static {v0, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    move-result v0

    .line 653
    goto :goto_10

    .line 654
    :cond_1c
    const/4 v0, 0x0

    .line 655
    :goto_10
    if-eqz v0, :cond_1d

    .line 656
    .line 657
    new-instance v0, LR4/V;

    .line 658
    .line 659
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 660
    .line 661
    .line 662
    iput-object v0, v3, LR4/k1;->P:LR4/V;

    .line 663
    .line 664
    :cond_1d
    if-eqz v9, :cond_1e

    .line 665
    .line 666
    iget-object v0, v9, LR4/i;->R:LR4/C1;

    .line 667
    .line 668
    if-eqz v0, :cond_1e

    .line 669
    .line 670
    iget-boolean v0, v0, LR4/C1;->a:Z

    .line 671
    .line 672
    if-ne v0, v5, :cond_1e

    .line 673
    .line 674
    move v0, v5

    .line 675
    goto :goto_11

    .line 676
    :cond_1e
    const/4 v0, 0x0

    .line 677
    :goto_11
    if-eqz v0, :cond_1f

    .line 678
    .line 679
    new-instance v0, LR4/V;

    .line 680
    .line 681
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 682
    .line 683
    .line 684
    iput-object v0, v3, LR4/k1;->z:LR4/V;

    .line 685
    .line 686
    :cond_1f
    if-eqz v9, :cond_20

    .line 687
    .line 688
    iget-object v0, v9, LR4/i;->U:LR4/x0;

    .line 689
    .line 690
    if-eqz v0, :cond_20

    .line 691
    .line 692
    iget-object v0, v0, LR4/x0;->a:Ljava/lang/Boolean;

    .line 693
    .line 694
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 695
    .line 696
    invoke-static {v0, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 697
    .line 698
    .line 699
    move-result v0

    .line 700
    goto :goto_12

    .line 701
    :cond_20
    const/4 v0, 0x0

    .line 702
    :goto_12
    if-eqz v0, :cond_21

    .line 703
    .line 704
    new-instance v0, LR4/V;

    .line 705
    .line 706
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 707
    .line 708
    .line 709
    iput-object v0, v3, LR4/k1;->o0:LR4/V;

    .line 710
    .line 711
    :cond_21
    if-eqz v2, :cond_29

    .line 712
    .line 713
    :try_start_1
    iget-object v0, v1, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 714
    .line 715
    if-eqz v0, :cond_22

    .line 716
    .line 717
    iget-object v0, v0, LR4/k1;->e:LT1/u;

    .line 718
    .line 719
    if-eqz v0, :cond_23

    .line 720
    .line 721
    invoke-virtual {v0, v2}, LT1/u;->d(Landroid/os/Bundle;)V

    .line 722
    .line 723
    .line 724
    goto :goto_14

    .line 725
    :catch_1
    move-exception v0

    .line 726
    goto :goto_13

    .line 727
    :cond_22
    invoke-static {v7}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 728
    .line 729
    .line 730
    throw v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 731
    :goto_13
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 732
    .line 733
    .line 734
    :cond_23
    :goto_14
    iget-object v0, v1, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 735
    .line 736
    if-eqz v0, :cond_28

    .line 737
    .line 738
    iget-object v0, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 739
    .line 740
    if-eqz v0, :cond_24

    .line 741
    .line 742
    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->restoreState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;

    .line 743
    .line 744
    .line 745
    :cond_24
    iget-object v0, v1, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 746
    .line 747
    if-eqz v0, :cond_27

    .line 748
    .line 749
    iget-object v0, v0, LR4/k1;->d:LR4/i;

    .line 750
    .line 751
    if-eqz v0, :cond_25

    .line 752
    .line 753
    iget-object v0, v0, LR4/i;->C:Ljava/lang/Boolean;

    .line 754
    .line 755
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 756
    .line 757
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 758
    .line 759
    .line 760
    move-result v0

    .line 761
    goto :goto_15

    .line 762
    :cond_25
    const/4 v0, 0x0

    .line 763
    :goto_15
    if-eqz v0, :cond_29

    .line 764
    .line 765
    iget-object v0, v1, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 766
    .line 767
    if-eqz v0, :cond_26

    .line 768
    .line 769
    iput-object v4, v0, LR4/k1;->r:Landroid/os/Bundle;

    .line 770
    .line 771
    goto :goto_16

    .line 772
    :cond_26
    invoke-static {v7}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 773
    .line 774
    .line 775
    throw v4

    .line 776
    :cond_27
    invoke-static {v7}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 777
    .line 778
    .line 779
    throw v4

    .line 780
    :cond_28
    invoke-static {v7}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 781
    .line 782
    .line 783
    throw v4

    .line 784
    :cond_29
    :goto_16
    iget-object v0, v1, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 785
    .line 786
    if-eqz v0, :cond_3e

    .line 787
    .line 788
    new-instance v2, LO3/D;

    .line 789
    .line 790
    invoke-direct {v2, v12}, LO3/D;-><init>(I)V

    .line 791
    .line 792
    .line 793
    iput-object v2, v0, LR4/k1;->N:LO3/D;

    .line 794
    .line 795
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 796
    .line 797
    .line 798
    move-result-object v2

    .line 799
    const-string v3, "getIntent(...)"

    .line 800
    .line 801
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 802
    .line 803
    .line 804
    invoke-static {v0, v2}, Ll6/d;->s(LR4/k1;Landroid/content/Intent;)V

    .line 805
    .line 806
    .line 807
    iget-object v0, v1, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 808
    .line 809
    if-eqz v0, :cond_3d

    .line 810
    .line 811
    iget-object v2, v0, LR4/k1;->d:LR4/i;

    .line 812
    .line 813
    if-eqz v2, :cond_2a

    .line 814
    .line 815
    iget-object v2, v2, LR4/i;->g:Ljava/lang/Integer;

    .line 816
    .line 817
    if-eqz v2, :cond_2a

    .line 818
    .line 819
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 820
    .line 821
    .line 822
    move-result v2

    .line 823
    iput v2, v0, LR4/k1;->f:I

    .line 824
    .line 825
    :cond_2a
    iget-object v0, v1, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 826
    .line 827
    if-eqz v0, :cond_3c

    .line 828
    .line 829
    iget-object v0, v0, LR4/k1;->d:LR4/i;

    .line 830
    .line 831
    if-eqz v0, :cond_2b

    .line 832
    .line 833
    iget-object v0, v0, LR4/i;->F:LR4/P2;

    .line 834
    .line 835
    if-eqz v0, :cond_2b

    .line 836
    .line 837
    iget-object v0, v0, LR4/P2;->a:Ljava/lang/Boolean;

    .line 838
    .line 839
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 840
    .line 841
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 842
    .line 843
    .line 844
    move-result v0

    .line 845
    goto :goto_17

    .line 846
    :cond_2b
    const/4 v0, 0x0

    .line 847
    :goto_17
    if-eqz v0, :cond_2e

    .line 848
    .line 849
    iget-object v0, v1, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 850
    .line 851
    if-eqz v0, :cond_2d

    .line 852
    .line 853
    iget-object v0, v0, LR4/k1;->S:Lg5/h;

    .line 854
    .line 855
    iget-object v0, v0, Lg5/h;->a:Lcom/web2native/MainActivity;

    .line 856
    .line 857
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    const-string v2, "android.hardware.nfc"

    .line 862
    .line 863
    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 864
    .line 865
    .line 866
    move-result v0

    .line 867
    if-eqz v0, :cond_2e

    .line 868
    .line 869
    iget-object v0, v1, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 870
    .line 871
    if-eqz v0, :cond_2c

    .line 872
    .line 873
    goto :goto_18

    .line 874
    :cond_2c
    invoke-static {v7}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 875
    .line 876
    .line 877
    throw v4

    .line 878
    :cond_2d
    invoke-static {v7}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 879
    .line 880
    .line 881
    throw v4

    .line 882
    :cond_2e
    :goto_18
    iget-object v0, v1, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 883
    .line 884
    if-eqz v0, :cond_3b

    .line 885
    .line 886
    iget-object v0, v0, LR4/k1;->d:LR4/i;

    .line 887
    .line 888
    if-eqz v0, :cond_2f

    .line 889
    .line 890
    iget-object v0, v0, LR4/i;->G:Ljava/lang/Boolean;

    .line 891
    .line 892
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 893
    .line 894
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 895
    .line 896
    .line 897
    move-result v0

    .line 898
    goto :goto_19

    .line 899
    :cond_2f
    const/4 v0, 0x0

    .line 900
    :goto_19
    if-eqz v0, :cond_31

    .line 901
    .line 902
    new-instance v0, Lcom/web2native/NotificationDisableBroadcastReceiver;

    .line 903
    .line 904
    invoke-direct {v0}, Lcom/web2native/NotificationDisableBroadcastReceiver;-><init>()V

    .line 905
    .line 906
    .line 907
    iput-object v0, v1, Lcom/web2native/MainActivity;->T:Lcom/web2native/NotificationDisableBroadcastReceiver;

    .line 908
    .line 909
    new-instance v2, Lcom/web2native/a;

    .line 910
    .line 911
    invoke-direct {v2, v1}, Lcom/web2native/a;-><init>(Lcom/web2native/MainActivity;)V

    .line 912
    .line 913
    .line 914
    iput-object v2, v0, Lcom/web2native/NotificationDisableBroadcastReceiver;->notificationBroadcastReceiverListener:Lcom/web2native/NotificationDisableBroadcastReceiver$NotificationBroadcastReceiverListener;

    .line 915
    .line 916
    new-instance v0, Landroid/content/IntentFilter;

    .line 917
    .line 918
    const-string v2, "com.web2native.NOTIFICATION_DATA_RECEIVED"

    .line 919
    .line 920
    invoke-direct {v0, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 921
    .line 922
    .line 923
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 924
    .line 925
    const/16 v3, 0x21

    .line 926
    .line 927
    if-lt v2, v3, :cond_30

    .line 928
    .line 929
    iget-object v2, v1, Lcom/web2native/MainActivity;->T:Lcom/web2native/NotificationDisableBroadcastReceiver;

    .line 930
    .line 931
    invoke-static {v1, v2, v0}, LC0/U;->v(Lcom/web2native/MainActivity;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 932
    .line 933
    .line 934
    goto :goto_1a

    .line 935
    :cond_30
    if-lt v2, v6, :cond_31

    .line 936
    .line 937
    iget-object v2, v1, Lcom/web2native/MainActivity;->T:Lcom/web2native/NotificationDisableBroadcastReceiver;

    .line 938
    .line 939
    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 940
    .line 941
    .line 942
    :cond_31
    :goto_1a
    iget-object v0, v1, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 943
    .line 944
    if-eqz v0, :cond_3a

    .line 945
    .line 946
    iget-object v0, v0, LR4/k1;->d:LR4/i;

    .line 947
    .line 948
    if-eqz v0, :cond_32

    .line 949
    .line 950
    iget-object v0, v0, LR4/i;->K:LR4/n;

    .line 951
    .line 952
    if-eqz v0, :cond_32

    .line 953
    .line 954
    iget-object v0, v0, LR4/n;->a:Ljava/lang/Boolean;

    .line 955
    .line 956
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 957
    .line 958
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 959
    .line 960
    .line 961
    move-result v0

    .line 962
    goto :goto_1b

    .line 963
    :cond_32
    const/4 v0, 0x0

    .line 964
    :goto_1b
    if-eqz v0, :cond_34

    .line 965
    .line 966
    iget-object v0, v1, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 967
    .line 968
    if-eqz v0, :cond_33

    .line 969
    .line 970
    new-instance v2, LR4/V;

    .line 971
    .line 972
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 973
    .line 974
    .line 975
    iput-object v2, v0, LR4/k1;->l0:LR4/V;

    .line 976
    .line 977
    goto :goto_1c

    .line 978
    :cond_33
    invoke-static {v7}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 979
    .line 980
    .line 981
    throw v4

    .line 982
    :cond_34
    :goto_1c
    new-instance v0, LJ5/u;

    .line 983
    .line 984
    const/4 v2, 0x4

    .line 985
    invoke-direct {v0, v2, v1}, LJ5/u;-><init>(ILjava/lang/Object;)V

    .line 986
    .line 987
    .line 988
    new-instance v2, LX/e;

    .line 989
    .line 990
    const v3, 0x423accb2

    .line 991
    .line 992
    .line 993
    invoke-direct {v2, v3, v5, v0}, LX/e;-><init>(IZLjava/lang/Object;)V

    .line 994
    .line 995
    .line 996
    sget-object v0, Lc/c;->a:Landroid/view/ViewGroup$LayoutParams;

    .line 997
    .line 998
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 999
    .line 1000
    .line 1001
    move-result-object v0

    .line 1002
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v0

    .line 1006
    const v3, 0x1020002

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v0

    .line 1013
    check-cast v0, Landroid/view/ViewGroup;

    .line 1014
    .line 1015
    const/4 v3, 0x0

    .line 1016
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v0

    .line 1020
    instance-of v3, v0, LC0/s0;

    .line 1021
    .line 1022
    if-eqz v3, :cond_35

    .line 1023
    .line 1024
    check-cast v0, LC0/s0;

    .line 1025
    .line 1026
    goto :goto_1d

    .line 1027
    :cond_35
    move-object v0, v4

    .line 1028
    :goto_1d
    if-eqz v0, :cond_36

    .line 1029
    .line 1030
    invoke-virtual {v0, v4}, LC0/a;->setParentCompositionContext(LP/r;)V

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v0, v2}, LC0/s0;->setContent(LB5/e;)V

    .line 1034
    .line 1035
    .line 1036
    goto :goto_1e

    .line 1037
    :cond_36
    new-instance v0, LC0/s0;

    .line 1038
    .line 1039
    invoke-direct {v0, v1}, LC0/s0;-><init>(Lcom/web2native/MainActivity;)V

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v0, v4}, LC0/a;->setParentCompositionContext(LP/r;)V

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v0, v2}, LC0/s0;->setContent(LB5/e;)V

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v2

    .line 1052
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v2

    .line 1056
    invoke-static {v2}, Landroidx/lifecycle/X;->d(Landroid/view/View;)Landroidx/lifecycle/x;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v3

    .line 1060
    if-nez v3, :cond_37

    .line 1061
    .line 1062
    invoke-static {v2, v1}, Landroidx/lifecycle/X;->h(Landroid/view/View;Landroidx/lifecycle/x;)V

    .line 1063
    .line 1064
    .line 1065
    :cond_37
    invoke-static {v2}, Landroidx/lifecycle/X;->e(Landroid/view/View;)Landroidx/lifecycle/l0;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v3

    .line 1069
    if-nez v3, :cond_38

    .line 1070
    .line 1071
    invoke-static {v2, v1}, Landroidx/lifecycle/X;->i(Landroid/view/View;Landroidx/lifecycle/l0;)V

    .line 1072
    .line 1073
    .line 1074
    :cond_38
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/n2;->p(Landroid/view/View;)Lg2/e;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v3

    .line 1078
    if-nez v3, :cond_39

    .line 1079
    .line 1080
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/measurement/n2;->M(Landroid/view/View;Lg2/e;)V

    .line 1081
    .line 1082
    .line 1083
    :cond_39
    sget-object v2, Lc/c;->a:Landroid/view/ViewGroup$LayoutParams;

    .line 1084
    .line 1085
    invoke-virtual {v1, v0, v2}, Lh/h;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1086
    .line 1087
    .line 1088
    goto :goto_1e

    .line 1089
    :cond_3a
    invoke-static {v7}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 1090
    .line 1091
    .line 1092
    throw v4

    .line 1093
    :cond_3b
    invoke-static {v7}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 1094
    .line 1095
    .line 1096
    throw v4

    .line 1097
    :cond_3c
    invoke-static {v7}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 1098
    .line 1099
    .line 1100
    throw v4

    .line 1101
    :cond_3d
    invoke-static {v7}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 1102
    .line 1103
    .line 1104
    throw v4

    .line 1105
    :cond_3e
    invoke-static {v7}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 1106
    .line 1107
    .line 1108
    throw v4

    .line 1109
    :cond_3f
    invoke-static {v7}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 1110
    .line 1111
    .line 1112
    throw v4

    .line 1113
    :cond_40
    invoke-static {v7}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 1114
    .line 1115
    .line 1116
    throw v4

    .line 1117
    :cond_41
    invoke-static {v7}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 1118
    .line 1119
    .line 1120
    throw v4

    .line 1121
    :cond_42
    invoke-static {v7}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 1122
    .line 1123
    .line 1124
    throw v4

    .line 1125
    :cond_43
    :goto_1e
    return-void
.end method

.method public final onDestroy()V
    .locals 5

    .line 1
    invoke-super {p0}, Lh/h;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/web2native/MainActivity;->S:Z

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const-string v2, "dataObject"

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, LR4/k1;->s:Lj5/c;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, v0, Lj5/c;->f:Landroidx/lifecycle/J;

    .line 20
    .line 21
    sget-object v3, Lm5/y;->a:Lm5/y;

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Landroidx/lifecycle/G;->k(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v1

    .line 31
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 32
    .line 33
    if-eqz v0, :cond_8

    .line 34
    .line 35
    iget-object v0, v0, LR4/k1;->d:LR4/i;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    iget-object v0, v0, LR4/i;->B:LR4/z1;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    iget-object v0, v0, LR4/z1;->a:Ljava/lang/Boolean;

    .line 45
    .line 46
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-static {v0, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move v0, v3

    .line 54
    :goto_1
    if-eqz v0, :cond_4

    .line 55
    .line 56
    iget-object v0, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v1

    .line 65
    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 66
    .line 67
    if-eqz v0, :cond_7

    .line 68
    .line 69
    iget-object v0, v0, LR4/k1;->d:LR4/i;

    .line 70
    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    iget-object v0, v0, LR4/i;->G:Ljava/lang/Boolean;

    .line 74
    .line 75
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    :cond_5
    if-eqz v3, :cond_6

    .line 82
    .line 83
    iget-object v0, p0, Lcom/web2native/MainActivity;->T:Lcom/web2native/NotificationDisableBroadcastReceiver;

    .line 84
    .line 85
    if-eqz v0, :cond_6

    .line 86
    .line 87
    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 88
    .line 89
    .line 90
    :cond_6
    const/4 v0, -0x1

    .line 91
    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    .line 92
    .line 93
    .line 94
    new-instance v0, Ljava/lang/RuntimeException;

    .line 95
    .line 96
    const-string v1, "System.exit returned normally, while it was supposed to halt JVM."

    .line 97
    .line 98
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw v0

    .line 102
    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw v1

    .line 106
    :cond_8
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v1
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .line 1
    const-string v0, "intent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lb/l;->onNewIntent(Landroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    iget-boolean v0, p0, Lcom/web2native/MainActivity;->S:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-static {v0, p1}, Ll6/d;->s(LR4/k1;Landroid/content/Intent;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string p1, "dataObject"

    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    throw p1

    .line 28
    :cond_1
    return-void
.end method

.method public final onPause()V
    .locals 4

    .line 1
    invoke-super {p0}, Lh/h;->onPause()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/web2native/MainActivity;->S:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, LR4/g1;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v1, p0, v2}, LR4/g1;-><init>(Lcom/web2native/MainActivity;I)V

    .line 21
    .line 22
    .line 23
    const-wide/16 v2, 0x3e8

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/web2native/MainActivity;->R:Lj5/c;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    iget-object v0, v0, Lj5/c;->d:Landroidx/lifecycle/J;

    .line 33
    .line 34
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroidx/lifecycle/G;->k(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object v0, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    const-string v2, "dataObject"

    .line 43
    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    iget-object v0, v0, LR4/k1;->d:LR4/i;

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    iget-object v0, v0, LR4/i;->B:LR4/z1;

    .line 51
    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    iget-object v0, v0, LR4/z1;->a:Ljava/lang/Boolean;

    .line 55
    .line 56
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-static {v0, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    const/4 v0, 0x0

    .line 64
    :goto_0
    if-eqz v0, :cond_3

    .line 65
    .line 66
    iget-object v0, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 67
    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v1

    .line 75
    :cond_3
    :goto_1
    return-void

    .line 76
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v1
.end method

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 2

    .line 1
    const-string v0, "permissions"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "grantResults"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1, p2, p3}, Lh/h;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 12
    .line 13
    .line 14
    const/16 p2, 0xde

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    const-string v1, "dataObject"

    .line 18
    .line 19
    if-ne p1, p2, :cond_3

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    aget p1, p3, p1

    .line 23
    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    iget-object p1, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0

    .line 35
    :cond_1
    iget-object p1, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v0

    .line 44
    :cond_3
    iget-object p2, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 45
    .line 46
    if-eqz p2, :cond_7

    .line 47
    .line 48
    iget v0, p2, LR4/k1;->c0:I

    .line 49
    .line 50
    if-ne p1, v0, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0, p3}, Lcom/web2native/MainActivity;->s([I)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_4
    iget v0, p2, LR4/k1;->e0:I

    .line 57
    .line 58
    if-ne p1, v0, :cond_5

    .line 59
    .line 60
    invoke-virtual {p0, p3}, Lcom/web2native/MainActivity;->s([I)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_5
    iget p2, p2, LR4/k1;->h0:I

    .line 65
    .line 66
    if-ne p1, p2, :cond_6

    .line 67
    .line 68
    invoke-virtual {p0, p3}, Lcom/web2native/MainActivity;->s([I)V

    .line 69
    .line 70
    .line 71
    :cond_6
    :goto_0
    return-void

    .line 72
    :cond_7
    invoke-static {v1}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v0
.end method

.method public final onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    const-string v0, "savedInstanceState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/app/Activity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    iget-boolean p1, p0, Lcom/web2native/MainActivity;->S:Z

    .line 10
    .line 11
    if-eqz p1, :cond_4

    .line 12
    .line 13
    iget-object p1, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    const-string v1, "dataObject"

    .line 17
    .line 18
    if-eqz p1, :cond_3

    .line 19
    .line 20
    iget-object p1, p1, LR4/k1;->d:LR4/i;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iget-object p1, p1, LR4/i;->C:Ljava/lang/Boolean;

    .line 25
    .line 26
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-static {p1, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    :goto_0
    if-eqz p1, :cond_4

    .line 35
    .line 36
    :try_start_0
    iget-object p1, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    iget-object v2, p1, LR4/k1;->k:Landroid/webkit/WebView;

    .line 41
    .line 42
    if-eqz v2, :cond_4

    .line 43
    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    iget-object p1, p1, LR4/k1;->r:Landroid/os/Bundle;

    .line 47
    .line 48
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, p1}, Landroid/webkit/WebView;->restoreState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catch_0
    move-exception p1

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0

    .line 73
    :cond_4
    return-void
.end method

.method public final onResume()V
    .locals 5

    .line 1
    invoke-super {p0}, Lh/h;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/web2native/MainActivity;->S:Z

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const-string v3, "dataObject"

    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    iget-object v0, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    iget-object v0, v0, LR4/k1;->s:Lj5/c;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, v0, Lj5/c;->c:Landroidx/lifecycle/J;

    .line 21
    .line 22
    sget-object v4, Lm5/y;->a:Lm5/y;

    .line 23
    .line 24
    invoke-virtual {v0, v4}, Landroidx/lifecycle/G;->k(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iput-boolean v2, v0, LR4/k1;->W:Z

    .line 32
    .line 33
    sget v0, Lh/D;->r:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v1

    .line 40
    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v1

    .line 44
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 45
    .line 46
    if-eqz v0, :cond_7

    .line 47
    .line 48
    iget-object v4, v0, LR4/k1;->i0:LR4/V;

    .line 49
    .line 50
    if-eqz v4, :cond_6

    .line 51
    .line 52
    iget-object v0, v0, LR4/k1;->d:LR4/i;

    .line 53
    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    iget-object v0, v0, LR4/i;->A:LR4/u;

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    iget-object v0, v0, LR4/u;->a:Ljava/lang/Boolean;

    .line 61
    .line 62
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    :cond_4
    if-eqz v2, :cond_6

    .line 69
    .line 70
    iget-object v0, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 71
    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    iget-object v0, v0, LR4/k1;->S:Lg5/h;

    .line 75
    .line 76
    const/4 v1, 0x1

    .line 77
    iput-boolean v1, v0, Lg5/h;->e:Z

    .line 78
    .line 79
    return-void

    .line 80
    :cond_5
    invoke-static {v3}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v1

    .line 84
    :cond_6
    return-void

    .line 85
    :cond_7
    invoke-static {v3}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v1
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    const-string v0, "outState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lb/l;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    iget-boolean v0, p0, Lcom/web2native/MainActivity;->S:Z

    .line 10
    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    new-instance v0, Landroid/os/Handler;

    .line 14
    .line 15
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 20
    .line 21
    .line 22
    new-instance v1, LR4/h1;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    const-wide/16 v2, 0x4b0

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    const-string v2, "dataObject"

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    iget-object v0, v0, LR4/k1;->d:LR4/i;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    iget-object v0, v0, LR4/i;->C:Ljava/lang/Boolean;

    .line 44
    .line 45
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-static {v0, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 v0, 0x0

    .line 53
    :goto_0
    if-eqz v0, :cond_5

    .line 54
    .line 55
    :try_start_0
    iget-object v0, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 56
    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    iput-object p1, v0, LR4/k1;->r:Landroid/os/Bundle;

    .line 60
    .line 61
    iget-object v0, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->saveState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :catch_0
    move-exception p1

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 76
    .line 77
    .line 78
    :cond_2
    :goto_2
    :try_start_1
    iget-object p1, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 79
    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    iget-object p1, p1, LR4/k1;->e:LT1/u;

    .line 83
    .line 84
    if-eqz p1, :cond_5

    .line 85
    .line 86
    invoke-virtual {p1}, LT1/u;->e()Landroid/os/Bundle;

    .line 87
    .line 88
    .line 89
    goto :goto_4

    .line 90
    :catch_1
    move-exception p1

    .line 91
    goto :goto_3

    .line 92
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 96
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 97
    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v1

    .line 104
    :cond_5
    :goto_4
    return-void
.end method

.method public final onStart()V
    .locals 2

    .line 1
    invoke-super {p0}, Lh/h;->onStart()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/web2native/MainActivity;->S:Z

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/web2native/MainActivity;->R:Lj5/c;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, v0, Lj5/c;->e:Landroidx/lifecycle/J;

    .line 17
    .line 18
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroidx/lifecycle/G;->k(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string v0, "dataObject"

    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    throw v0

    .line 31
    :cond_1
    return-void
.end method

.method public final s([I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    aget p1, p1, v0

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const-string v1, "dataObject"

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, LR4/k1;->S:Lg5/h;

    .line 14
    .line 15
    iget-object p1, p1, Lg5/h;->r:Landroid/webkit/PermissionRequest;

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/webkit/PermissionRequest;->getResources()[Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p1, v0}, Landroid/webkit/PermissionRequest;->grant([Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0

    .line 31
    :cond_1
    iget-object p1, p0, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    iget-object p1, p1, LR4/k1;->S:Lg5/h;

    .line 36
    .line 37
    iget-object p1, p1, Lg5/h;->r:Landroid/webkit/PermissionRequest;

    .line 38
    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/webkit/PermissionRequest;->deny()V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-void

    .line 45
    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0
.end method
