.class public final Lcom/google/android/gms/internal/measurement/f0;
.super Lcom/google/android/gms/internal/measurement/o0;
.source "SourceFile"


# instance fields
.field public final synthetic u:I

.field public final synthetic v:Ljava/lang/Object;

.field public final synthetic w:Ljava/lang/Object;

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/s0;Landroid/app/Activity;Lcom/google/android/gms/internal/measurement/G;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/measurement/f0;->u:I

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/f0;->w:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/f0;->x:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/f0;->v:Ljava/lang/Object;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/s0;->q:Lcom/google/android/gms/internal/measurement/t0;

    const/4 p2, 0x1

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/o0;-><init>(Lcom/google/android/gms/internal/measurement/t0;Z)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/measurement/s0;Landroid/os/Bundle;Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/internal/measurement/f0;->u:I

    .line 3
    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/f0;->x:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/f0;->w:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/f0;->v:Ljava/lang/Object;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/s0;->q:Lcom/google/android/gms/internal/measurement/t0;

    const/4 p2, 0x1

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/o0;-><init>(Lcom/google/android/gms/internal/measurement/t0;Z)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/measurement/t0;Landroid/content/Context;Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/measurement/f0;->u:I

    .line 5
    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/f0;->w:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/f0;->x:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/f0;->v:Ljava/lang/Object;

    const/4 p2, 0x1

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/o0;-><init>(Lcom/google/android/gms/internal/measurement/t0;Z)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/measurement/t0;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/G;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/measurement/f0;->u:I

    .line 7
    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/f0;->w:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/f0;->x:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/f0;->v:Ljava/lang/Object;

    const/4 p2, 0x1

    .line 8
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/o0;-><init>(Lcom/google/android/gms/internal/measurement/t0;Z)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/measurement/t0;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/f0;->u:I

    .line 9
    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/f0;->w:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/f0;->x:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/f0;->v:Ljava/lang/Object;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/o0;-><init>(Lcom/google/android/gms/internal/measurement/t0;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lcom/google/android/gms/internal/measurement/f0;->u:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lcom/google/android/gms/internal/measurement/f0;->v:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lcom/google/android/gms/internal/measurement/s0;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/s0;->q:Lcom/google/android/gms/internal/measurement/t0;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/t0;->f:Lcom/google/android/gms/internal/measurement/J;

    .line 15
    .line 16
    invoke-static {v0}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/f0;->w:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Landroid/app/Activity;

    .line 22
    .line 23
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/X;->W(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/X;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/f0;->x:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v3, Lcom/google/android/gms/internal/measurement/G;

    .line 30
    .line 31
    iget-wide v4, v1, Lcom/google/android/gms/internal/measurement/o0;->r:J

    .line 32
    .line 33
    invoke-interface {v0, v2, v3, v4, v5}, Lcom/google/android/gms/internal/measurement/J;->onActivitySaveInstanceStateByScionActivityInfo(Lcom/google/android/gms/internal/measurement/X;Lcom/google/android/gms/internal/measurement/L;J)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_0
    iget-object v0, v1, Lcom/google/android/gms/internal/measurement/f0;->x:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Landroid/os/Bundle;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    new-instance v2, Landroid/os/Bundle;

    .line 44
    .line 45
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v3, "com.google.app_measurement.screen_service"

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_1

    .line 55
    .line 56
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    instance-of v4, v0, Landroid/os/Bundle;

    .line 61
    .line 62
    if-eqz v4, :cond_1

    .line 63
    .line 64
    check-cast v0, Landroid/os/Bundle;

    .line 65
    .line 66
    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    const/4 v2, 0x0

    .line 71
    :cond_1
    :goto_0
    iget-object v0, v1, Lcom/google/android/gms/internal/measurement/f0;->v:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Lcom/google/android/gms/internal/measurement/s0;

    .line 74
    .line 75
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/s0;->q:Lcom/google/android/gms/internal/measurement/t0;

    .line 76
    .line 77
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/t0;->f:Lcom/google/android/gms/internal/measurement/J;

    .line 78
    .line 79
    invoke-static {v0}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/f0;->w:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v3, Landroid/app/Activity;

    .line 85
    .line 86
    iget-wide v4, v1, Lcom/google/android/gms/internal/measurement/o0;->r:J

    .line 87
    .line 88
    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/X;->W(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/X;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-interface {v0, v3, v2, v4, v5}, Lcom/google/android/gms/internal/measurement/J;->onActivityCreatedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/X;Landroid/os/Bundle;J)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :pswitch_1
    iget-object v0, v1, Lcom/google/android/gms/internal/measurement/f0;->v:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Lcom/google/android/gms/internal/measurement/t0;

    .line 99
    .line 100
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/t0;->f:Lcom/google/android/gms/internal/measurement/J;

    .line 101
    .line 102
    invoke-static {v0}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/f0;->w:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v2, Ljava/lang/String;

    .line 108
    .line 109
    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/f0;->x:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v3, Lcom/google/android/gms/internal/measurement/G;

    .line 112
    .line 113
    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/internal/measurement/J;->getMaxUserProperties(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/L;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_2
    iget-object v0, v1, Lcom/google/android/gms/internal/measurement/f0;->v:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, Lcom/google/android/gms/internal/measurement/t0;

    .line 120
    .line 121
    iget-object v2, v0, Lcom/google/android/gms/internal/measurement/t0;->f:Lcom/google/android/gms/internal/measurement/J;

    .line 122
    .line 123
    invoke-static {v2}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    iget-object v0, v1, Lcom/google/android/gms/internal/measurement/f0;->x:Ljava/lang/Object;

    .line 127
    .line 128
    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/f0;->w:Ljava/lang/Object;

    .line 129
    .line 130
    move-object v4, v3

    .line 131
    check-cast v4, Ljava/lang/String;

    .line 132
    .line 133
    new-instance v5, LD3/b;

    .line 134
    .line 135
    invoke-direct {v5, v0}, LD3/b;-><init>(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    new-instance v6, LD3/b;

    .line 139
    .line 140
    const/4 v0, 0x0

    .line 141
    invoke-direct {v6, v0}, LD3/b;-><init>(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    new-instance v7, LD3/b;

    .line 145
    .line 146
    invoke-direct {v7, v0}, LD3/b;-><init>(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    const/4 v3, 0x5

    .line 150
    invoke-interface/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/J;->logHealthData(ILjava/lang/String;LD3/a;LD3/a;LD3/a;)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :pswitch_3
    const/4 v2, 0x0

    .line 155
    const/4 v3, 0x1

    .line 156
    :try_start_0
    iget-object v0, v1, Lcom/google/android/gms/internal/measurement/f0;->w:Ljava/lang/Object;

    .line 157
    .line 158
    move-object v4, v0

    .line 159
    check-cast v4, Landroid/content/Context;

    .line 160
    .line 161
    invoke-static {v4}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v4}, LO3/K0;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    if-eqz v6, :cond_2

    .line 177
    .line 178
    invoke-static {v4}, LO3/K0;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    goto :goto_1

    .line 183
    :catch_0
    move-exception v0

    .line 184
    goto/16 :goto_8

    .line 185
    .line 186
    :cond_2
    :goto_1
    const-string v6, "google_analytics_force_disable_updates"

    .line 187
    .line 188
    const-string v7, "bool"

    .line 189
    .line 190
    invoke-virtual {v5, v6, v7, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 191
    .line 192
    .line 193
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 194
    const/4 v6, 0x0

    .line 195
    if-nez v0, :cond_3

    .line 196
    .line 197
    :catch_1
    move-object v5, v6

    .line 198
    goto :goto_2

    .line 199
    :cond_3
    :try_start_1
    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 204
    .line 205
    .line 206
    move-result-object v0
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 207
    move-object v5, v0

    .line 208
    :goto_2
    :try_start_2
    iget-object v0, v1, Lcom/google/android/gms/internal/measurement/f0;->v:Ljava/lang/Object;

    .line 209
    .line 210
    move-object v7, v0

    .line 211
    check-cast v7, Lcom/google/android/gms/internal/measurement/t0;

    .line 212
    .line 213
    if-eqz v5, :cond_4

    .line 214
    .line 215
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-nez v0, :cond_5

    .line 220
    .line 221
    :cond_4
    move v0, v3

    .line 222
    goto :goto_3

    .line 223
    :cond_5
    move v0, v2

    .line 224
    :goto_3
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 225
    .line 226
    .line 227
    const-string v8, "com.google.android.gms.measurement.dynamite"

    .line 228
    .line 229
    if-eqz v0, :cond_6

    .line 230
    .line 231
    :try_start_3
    sget-object v0, LE3/f;->c:Ls4/e;

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :catch_2
    move-exception v0

    .line 235
    goto :goto_5

    .line 236
    :cond_6
    sget-object v0, LE3/f;->b:Lx3/k;

    .line 237
    .line 238
    :goto_4
    invoke-static {v4, v0, v8}, LE3/f;->c(Landroid/content/Context;LE3/e;Ljava/lang/String;)LE3/f;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    const-string v9, "com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"

    .line 243
    .line 244
    invoke-virtual {v0, v9}, LE3/f;->b(Ljava/lang/String;)Landroid/os/IBinder;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/I;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/internal/measurement/J;

    .line 249
    .line 250
    .line 251
    move-result-object v6
    :try_end_3
    .catch LE3/b; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 252
    goto :goto_6

    .line 253
    :goto_5
    :try_start_4
    invoke-virtual {v7, v0, v3, v2}, Lcom/google/android/gms/internal/measurement/t0;->d(Ljava/lang/Exception;ZZ)V

    .line 254
    .line 255
    .line 256
    :goto_6
    iput-object v6, v7, Lcom/google/android/gms/internal/measurement/t0;->f:Lcom/google/android/gms/internal/measurement/J;

    .line 257
    .line 258
    iget-object v0, v7, Lcom/google/android/gms/internal/measurement/t0;->f:Lcom/google/android/gms/internal/measurement/J;

    .line 259
    .line 260
    if-nez v0, :cond_7

    .line 261
    .line 262
    const-string v0, "FA"

    .line 263
    .line 264
    const-string v4, "Failed to connect to measurement client."

    .line 265
    .line 266
    invoke-static {v0, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 267
    .line 268
    .line 269
    goto :goto_9

    .line 270
    :cond_7
    invoke-static {v4, v8}, LE3/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    invoke-static {v4, v8, v2}, LE3/f;->d(Landroid/content/Context;Ljava/lang/String;Z)I

    .line 275
    .line 276
    .line 277
    move-result v6

    .line 278
    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    .line 279
    .line 280
    .line 281
    move-result v8

    .line 282
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 283
    .line 284
    invoke-virtual {v9, v5}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v5

    .line 288
    if-nez v5, :cond_8

    .line 289
    .line 290
    if-ge v6, v0, :cond_9

    .line 291
    .line 292
    :cond_8
    move v14, v3

    .line 293
    goto :goto_7

    .line 294
    :cond_9
    move v14, v2

    .line 295
    :goto_7
    new-instance v9, Lcom/google/android/gms/internal/measurement/V;

    .line 296
    .line 297
    int-to-long v12, v8

    .line 298
    iget-object v0, v1, Lcom/google/android/gms/internal/measurement/f0;->x:Ljava/lang/Object;

    .line 299
    .line 300
    move-object v15, v0

    .line 301
    check-cast v15, Landroid/os/Bundle;

    .line 302
    .line 303
    invoke-static {v4}, LO3/K0;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v16

    .line 307
    const-wide/32 v10, 0x1fbd0

    .line 308
    .line 309
    .line 310
    invoke-direct/range {v9 .. v16}, Lcom/google/android/gms/internal/measurement/V;-><init>(JJZLandroid/os/Bundle;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    iget-object v0, v7, Lcom/google/android/gms/internal/measurement/t0;->f:Lcom/google/android/gms/internal/measurement/J;

    .line 314
    .line 315
    invoke-static {v0}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    new-instance v5, LD3/b;

    .line 319
    .line 320
    invoke-direct {v5, v4}, LD3/b;-><init>(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    iget-wide v6, v1, Lcom/google/android/gms/internal/measurement/o0;->q:J

    .line 324
    .line 325
    invoke-interface {v0, v5, v9, v6, v7}, Lcom/google/android/gms/internal/measurement/J;->initialize(LD3/a;Lcom/google/android/gms/internal/measurement/V;J)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 326
    .line 327
    .line 328
    goto :goto_9

    .line 329
    :goto_8
    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/f0;->v:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v4, Lcom/google/android/gms/internal/measurement/t0;

    .line 332
    .line 333
    invoke-virtual {v4, v0, v3, v2}, Lcom/google/android/gms/internal/measurement/t0;->d(Ljava/lang/Exception;ZZ)V

    .line 334
    .line 335
    .line 336
    :goto_9
    return-void

    .line 337
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/f0;->u:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f0;->x:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lcom/google/android/gms/internal/measurement/G;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/G;->a(Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
