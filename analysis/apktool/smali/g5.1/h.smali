.class public final Lg5/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/web2native/MainActivity;

.field public final b:LR4/k1;

.field public final c:Le/g;

.field public final d:Le/g;

.field public e:Z

.field public f:Ljava/util/HashMap;

.field public final g:Le/g;

.field public final h:Le/g;

.field public final i:Le/g;

.field public final j:Le/g;

.field public final k:Le/g;

.field public final l:Le/g;

.field public final m:Le/g;

.field public final n:Le/g;

.field public final o:Le/g;

.field public p:Ljava/lang/String;

.field public q:Landroid/webkit/ValueCallback;

.field public r:Landroid/webkit/PermissionRequest;

.field public final s:Le/g;

.field public t:Ljava/lang/String;

.field public u:Z

.field public v:Ljava/lang/String;

.field public w:Lorg/json/JSONObject;

.field public final x:Le/g;


# direct methods
.method public constructor <init>(Lcom/web2native/MainActivity;LR4/k1;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg5/h;->a:Lcom/web2native/MainActivity;

    .line 5
    .line 6
    iput-object p2, p0, Lg5/h;->b:LR4/k1;

    .line 7
    .line 8
    new-instance v0, LJ1/D;

    .line 9
    .line 10
    const/4 v1, 0x5

    .line 11
    invoke-direct {v0, v1}, LJ1/D;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lg5/e;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, v2}, Lg5/e;-><init>(Lg5/h;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Lb/l;->k(Lcom/google/android/gms/internal/measurement/I1;Le/b;)Le/g;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lg5/h;->x:Le/g;

    .line 25
    .line 26
    new-instance v0, LJ1/D;

    .line 27
    .line 28
    const/4 v1, 0x7

    .line 29
    invoke-direct {v0, v1}, LJ1/D;-><init>(I)V

    .line 30
    .line 31
    .line 32
    new-instance v1, Lg5/e;

    .line 33
    .line 34
    const/16 v2, 0xd

    .line 35
    .line 36
    invoke-direct {v1, p0, v2}, Lg5/e;-><init>(Lg5/h;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0, v1}, Lb/l;->k(Lcom/google/android/gms/internal/measurement/I1;Le/b;)Le/g;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lg5/h;->s:Le/g;

    .line 44
    .line 45
    new-instance v0, LJ1/D;

    .line 46
    .line 47
    const/4 v1, 0x6

    .line 48
    invoke-direct {v0, v1}, LJ1/D;-><init>(I)V

    .line 49
    .line 50
    .line 51
    new-instance v1, Lg5/e;

    .line 52
    .line 53
    const/16 v2, 0xe

    .line 54
    .line 55
    invoke-direct {v1, p0, v2}, Lg5/e;-><init>(Lg5/h;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v0, v1}, Lb/l;->k(Lcom/google/android/gms/internal/measurement/I1;Le/b;)Le/g;

    .line 59
    .line 60
    .line 61
    new-instance v0, LJ1/D;

    .line 62
    .line 63
    const/4 v1, 0x6

    .line 64
    invoke-direct {v0, v1}, LJ1/D;-><init>(I)V

    .line 65
    .line 66
    .line 67
    new-instance v1, Lg5/e;

    .line 68
    .line 69
    const/16 v2, 0xf

    .line 70
    .line 71
    invoke-direct {v1, p0, v2}, Lg5/e;-><init>(Lg5/h;I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v0, v1}, Lb/l;->k(Lcom/google/android/gms/internal/measurement/I1;Le/b;)Le/g;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iput-object v0, p0, Lg5/h;->d:Le/g;

    .line 79
    .line 80
    new-instance v0, LJ1/D;

    .line 81
    .line 82
    const/4 v1, 0x6

    .line 83
    invoke-direct {v0, v1}, LJ1/D;-><init>(I)V

    .line 84
    .line 85
    .line 86
    new-instance v1, Lg5/e;

    .line 87
    .line 88
    const/4 v2, 0x1

    .line 89
    invoke-direct {v1, p0, v2}, Lg5/e;-><init>(Lg5/h;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v0, v1}, Lb/l;->k(Lcom/google/android/gms/internal/measurement/I1;Le/b;)Le/g;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iput-object v0, p0, Lg5/h;->c:Le/g;

    .line 97
    .line 98
    new-instance v0, LJ1/D;

    .line 99
    .line 100
    const/4 v1, 0x5

    .line 101
    invoke-direct {v0, v1}, LJ1/D;-><init>(I)V

    .line 102
    .line 103
    .line 104
    new-instance v1, Lg5/e;

    .line 105
    .line 106
    const/4 v2, 0x2

    .line 107
    invoke-direct {v1, p0, v2}, Lg5/e;-><init>(Lg5/h;I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v0, v1}, Lb/l;->k(Lcom/google/android/gms/internal/measurement/I1;Le/b;)Le/g;

    .line 111
    .line 112
    .line 113
    new-instance v0, LO3/Y;

    .line 114
    .line 115
    invoke-direct {v0}, LO3/Y;-><init>()V

    .line 116
    .line 117
    .line 118
    iput-object v0, p2, LR4/k1;->T:LO3/Y;

    .line 119
    .line 120
    new-instance v0, LJ1/D;

    .line 121
    .line 122
    const/4 v1, 0x5

    .line 123
    invoke-direct {v0, v1}, LJ1/D;-><init>(I)V

    .line 124
    .line 125
    .line 126
    new-instance v1, Lg5/e;

    .line 127
    .line 128
    const/4 v2, 0x3

    .line 129
    invoke-direct {v1, p0, v2}, Lg5/e;-><init>(Lg5/h;I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v0, v1}, Lb/l;->k(Lcom/google/android/gms/internal/measurement/I1;Le/b;)Le/g;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    iput-object v0, p0, Lg5/h;->g:Le/g;

    .line 137
    .line 138
    new-instance v0, LJ1/D;

    .line 139
    .line 140
    const/4 v1, 0x1

    .line 141
    invoke-direct {v0, v1}, LJ1/D;-><init>(I)V

    .line 142
    .line 143
    .line 144
    new-instance v1, Lg5/e;

    .line 145
    .line 146
    const/4 v2, 0x4

    .line 147
    invoke-direct {v1, p0, v2}, Lg5/e;-><init>(Lg5/h;I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, v0, v1}, Lb/l;->k(Lcom/google/android/gms/internal/measurement/I1;Le/b;)Le/g;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2}, LR4/k1;->a()LO3/Y;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    new-instance v0, LR4/V;

    .line 158
    .line 159
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 160
    .line 161
    .line 162
    iput-object v0, p2, LO3/Y;->e:Ljava/lang/Object;

    .line 163
    .line 164
    new-instance p2, LR4/V1;

    .line 165
    .line 166
    const/16 v0, 0x11

    .line 167
    .line 168
    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/measurement/I1;-><init>(I)V

    .line 169
    .line 170
    .line 171
    new-instance v0, Lg5/e;

    .line 172
    .line 173
    const/4 v1, 0x5

    .line 174
    invoke-direct {v0, p0, v1}, Lg5/e;-><init>(Lg5/h;I)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, p2, v0}, Lb/l;->k(Lcom/google/android/gms/internal/measurement/I1;Le/b;)Le/g;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    iput-object p2, p0, Lg5/h;->h:Le/g;

    .line 182
    .line 183
    new-instance p2, LR4/V1;

    .line 184
    .line 185
    const/16 v0, 0x11

    .line 186
    .line 187
    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/measurement/I1;-><init>(I)V

    .line 188
    .line 189
    .line 190
    new-instance v0, Lg5/e;

    .line 191
    .line 192
    const/4 v1, 0x6

    .line 193
    invoke-direct {v0, p0, v1}, Lg5/e;-><init>(Lg5/h;I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, p2, v0}, Lb/l;->k(Lcom/google/android/gms/internal/measurement/I1;Le/b;)Le/g;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    iput-object p2, p0, Lg5/h;->i:Le/g;

    .line 201
    .line 202
    new-instance p2, LJ1/D;

    .line 203
    .line 204
    const/4 v0, 0x6

    .line 205
    invoke-direct {p2, v0}, LJ1/D;-><init>(I)V

    .line 206
    .line 207
    .line 208
    new-instance v0, Lg5/e;

    .line 209
    .line 210
    const/4 v1, 0x7

    .line 211
    invoke-direct {v0, p0, v1}, Lg5/e;-><init>(Lg5/h;I)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1, p2, v0}, Lb/l;->k(Lcom/google/android/gms/internal/measurement/I1;Le/b;)Le/g;

    .line 215
    .line 216
    .line 217
    move-result-object p2

    .line 218
    iput-object p2, p0, Lg5/h;->o:Le/g;

    .line 219
    .line 220
    new-instance p2, LJ1/D;

    .line 221
    .line 222
    const/4 v0, 0x3

    .line 223
    invoke-direct {p2, v0}, LJ1/D;-><init>(I)V

    .line 224
    .line 225
    .line 226
    new-instance v0, Lg5/e;

    .line 227
    .line 228
    const/16 v1, 0x8

    .line 229
    .line 230
    invoke-direct {v0, p0, v1}, Lg5/e;-><init>(Lg5/h;I)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p1, p2, v0}, Lb/l;->k(Lcom/google/android/gms/internal/measurement/I1;Le/b;)Le/g;

    .line 234
    .line 235
    .line 236
    move-result-object p2

    .line 237
    iput-object p2, p0, Lg5/h;->j:Le/g;

    .line 238
    .line 239
    new-instance p2, LJ1/D;

    .line 240
    .line 241
    const/4 v0, 0x4

    .line 242
    invoke-direct {p2, v0}, LJ1/D;-><init>(I)V

    .line 243
    .line 244
    .line 245
    new-instance v0, Lg5/e;

    .line 246
    .line 247
    const/16 v1, 0x9

    .line 248
    .line 249
    invoke-direct {v0, p0, v1}, Lg5/e;-><init>(Lg5/h;I)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p1, p2, v0}, Lb/l;->k(Lcom/google/android/gms/internal/measurement/I1;Le/b;)Le/g;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    iput-object p2, p0, Lg5/h;->k:Le/g;

    .line 257
    .line 258
    new-instance p2, LJ1/D;

    .line 259
    .line 260
    const/4 v0, 0x6

    .line 261
    invoke-direct {p2, v0}, LJ1/D;-><init>(I)V

    .line 262
    .line 263
    .line 264
    new-instance v0, Lg5/e;

    .line 265
    .line 266
    const/16 v1, 0xa

    .line 267
    .line 268
    invoke-direct {v0, p0, v1}, Lg5/e;-><init>(Lg5/h;I)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {p1, p2, v0}, Lb/l;->k(Lcom/google/android/gms/internal/measurement/I1;Le/b;)Le/g;

    .line 272
    .line 273
    .line 274
    move-result-object p2

    .line 275
    iput-object p2, p0, Lg5/h;->l:Le/g;

    .line 276
    .line 277
    new-instance p2, LJ1/D;

    .line 278
    .line 279
    const/4 v0, 0x6

    .line 280
    invoke-direct {p2, v0}, LJ1/D;-><init>(I)V

    .line 281
    .line 282
    .line 283
    new-instance v0, Lg5/e;

    .line 284
    .line 285
    const/16 v1, 0xb

    .line 286
    .line 287
    invoke-direct {v0, p0, v1}, Lg5/e;-><init>(Lg5/h;I)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p1, p2, v0}, Lb/l;->k(Lcom/google/android/gms/internal/measurement/I1;Le/b;)Le/g;

    .line 291
    .line 292
    .line 293
    move-result-object p2

    .line 294
    iput-object p2, p0, Lg5/h;->m:Le/g;

    .line 295
    .line 296
    new-instance p2, LJ1/D;

    .line 297
    .line 298
    const/4 v0, 0x2

    .line 299
    invoke-direct {p2, v0}, LJ1/D;-><init>(I)V

    .line 300
    .line 301
    .line 302
    new-instance v0, Lg5/e;

    .line 303
    .line 304
    const/16 v1, 0xc

    .line 305
    .line 306
    invoke-direct {v0, p0, v1}, Lg5/e;-><init>(Lg5/h;I)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {p1, p2, v0}, Lb/l;->k(Lcom/google/android/gms/internal/measurement/I1;Le/b;)Le/g;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    iput-object p1, p0, Lg5/h;->n:Le/g;

    .line 314
    .line 315
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const-string v1, "w2n://"

    .line 5
    .line 6
    invoke-static {p1, v1}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-ne v1, v0, :cond_0

    .line 11
    .line 12
    const-string v1, "w2n://permission-"

    .line 13
    .line 14
    invoke-static {p1, v1}, LJ5/m;->a1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    if-eqz p1, :cond_f

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    iget-object v3, p0, Lg5/h;->b:LR4/k1;

    .line 26
    .line 27
    iget-object v4, p0, Lg5/h;->a:Lcom/web2native/MainActivity;

    .line 28
    .line 29
    const-string v5, "PERMANENTLY_BLOCKED"

    .line 30
    .line 31
    const-string v6, "ALLOWED"

    .line 32
    .line 33
    sparse-switch v2, :sswitch_data_0

    .line 34
    .line 35
    .line 36
    goto/16 :goto_1

    .line 37
    .line 38
    :sswitch_0
    const-string v0, "bluetooth"

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    goto/16 :goto_1

    .line 47
    .line 48
    :cond_1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 49
    .line 50
    const/16 v0, 0x1f

    .line 51
    .line 52
    if-lt p1, v0, :cond_4

    .line 53
    .line 54
    const-string p1, "android.permission.BLUETOOTH_SCAN"

    .line 55
    .line 56
    invoke-static {v4, p1}, Lk1/c;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_2

    .line 61
    .line 62
    const-string v0, "android.permission.BLUETOOTH_CONNECT"

    .line 63
    .line 64
    invoke-static {v4, v0}, Lk1/c;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_2

    .line 69
    .line 70
    :goto_0
    move-object v1, v6

    .line 71
    goto/16 :goto_1

    .line 72
    .line 73
    :cond_2
    invoke-static {v4, p1}, Lk1/c;->i(Lcom/web2native/MainActivity;Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    const-string v1, "NOT_ALLOWED"

    .line 80
    .line 81
    goto/16 :goto_1

    .line 82
    .line 83
    :cond_3
    move-object v1, v5

    .line 84
    goto/16 :goto_1

    .line 85
    .line 86
    :cond_4
    iget-object p1, v3, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 87
    .line 88
    const-string v0, "android.permission.BLUETOOTH"

    .line 89
    .line 90
    invoke-virtual {p1, v0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-nez p1, :cond_3

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :sswitch_1
    const-string v0, "location"

    .line 98
    .line 99
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-nez p1, :cond_5

    .line 104
    .line 105
    goto/16 :goto_1

    .line 106
    .line 107
    :cond_5
    const-string p1, "android.permission.ACCESS_FINE_LOCATION"

    .line 108
    .line 109
    invoke-virtual {p0, p1}, Lg5/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    goto/16 :goto_1

    .line 114
    .line 115
    :sswitch_2
    const-string v0, "contact"

    .line 116
    .line 117
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-nez p1, :cond_6

    .line 122
    .line 123
    goto/16 :goto_1

    .line 124
    .line 125
    :cond_6
    const-string p1, "android.permission.READ_CONTACTS"

    .line 126
    .line 127
    invoke-virtual {p0, p1}, Lg5/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    goto/16 :goto_1

    .line 132
    .line 133
    :sswitch_3
    const-string v0, "notification"

    .line 134
    .line 135
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-nez p1, :cond_7

    .line 140
    .line 141
    goto/16 :goto_1

    .line 142
    .line 143
    :cond_7
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 144
    .line 145
    const/16 v0, 0x21

    .line 146
    .line 147
    if-lt p1, v0, :cond_8

    .line 148
    .line 149
    const-string p1, "android.permission.POST_NOTIFICATIONS"

    .line 150
    .line 151
    invoke-virtual {p0, p1}, Lg5/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    goto/16 :goto_1

    .line 156
    .line 157
    :cond_8
    new-instance p1, Lk1/m;

    .line 158
    .line 159
    invoke-direct {p1, v4}, Lk1/m;-><init>(Landroid/content/Context;)V

    .line 160
    .line 161
    .line 162
    iget-object p1, p1, Lk1/m;->a:Landroid/app/NotificationManager;

    .line 163
    .line 164
    invoke-virtual {p1}, Landroid/app/NotificationManager;->areNotificationsEnabled()Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-eqz p1, :cond_3

    .line 169
    .line 170
    goto :goto_0

    .line 171
    :sswitch_4
    const-string v0, "enableBluetooth"

    .line 172
    .line 173
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    if-nez p1, :cond_9

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_9
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    if-eqz p1, :cond_a

    .line 185
    .line 186
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    :cond_a
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 195
    .line 196
    invoke-static {v1, p1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    if-eqz p1, :cond_3

    .line 201
    .line 202
    goto/16 :goto_0

    .line 203
    .line 204
    :sswitch_5
    const-string v2, "enableNfc"

    .line 205
    .line 206
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    if-nez p1, :cond_b

    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_b
    invoke-static {v4}, Landroid/nfc/NfcAdapter;->getDefaultAdapter(Landroid/content/Context;)Landroid/nfc/NfcAdapter;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    if-eqz p1, :cond_3

    .line 218
    .line 219
    invoke-virtual {p1}, Landroid/nfc/NfcAdapter;->isEnabled()Z

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    if-ne p1, v0, :cond_3

    .line 224
    .line 225
    goto/16 :goto_0

    .line 226
    .line 227
    :sswitch_6
    const-string v0, "camera"

    .line 228
    .line 229
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result p1

    .line 233
    if-nez p1, :cond_c

    .line 234
    .line 235
    goto :goto_1

    .line 236
    :cond_c
    const-string p1, "android.permission.CAMERA"

    .line 237
    .line 238
    invoke-virtual {p0, p1}, Lg5/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    goto :goto_1

    .line 243
    :sswitch_7
    const-string v0, "enableLocation"

    .line 244
    .line 245
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result p1

    .line 249
    if-nez p1, :cond_d

    .line 250
    .line 251
    goto :goto_1

    .line 252
    :cond_d
    iget-object p1, v3, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 253
    .line 254
    invoke-static {p1}, Ll6/d;->u(Landroid/content/Context;)Z

    .line 255
    .line 256
    .line 257
    move-result p1

    .line 258
    if-eqz p1, :cond_3

    .line 259
    .line 260
    goto/16 :goto_0

    .line 261
    .line 262
    :sswitch_8
    const-string v0, "record_audio"

    .line 263
    .line 264
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result p1

    .line 268
    if-nez p1, :cond_e

    .line 269
    .line 270
    goto :goto_1

    .line 271
    :cond_e
    const-string p1, "android.permission.RECORD_AUDIO"

    .line 272
    .line 273
    invoke-virtual {p0, p1}, Lg5/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    :cond_f
    :goto_1
    iget-boolean p1, p0, Lg5/h;->e:Z

    .line 278
    .line 279
    if-eqz p1, :cond_10

    .line 280
    .line 281
    if-eqz v1, :cond_10

    .line 282
    .line 283
    iget-object p1, p0, Lg5/h;->v:Ljava/lang/String;

    .line 284
    .line 285
    const-string v0, "openAppSettingForPermission"

    .line 286
    .line 287
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result p1

    .line 291
    if-nez p1, :cond_11

    .line 292
    .line 293
    :cond_10
    iget-boolean p1, p0, Lg5/h;->u:Z

    .line 294
    .line 295
    if-eqz p1, :cond_12

    .line 296
    .line 297
    :cond_11
    iget-object p1, p0, Lg5/h;->v:Ljava/lang/String;

    .line 298
    .line 299
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {p0, p1, v1}, Lg5/h;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    :cond_12
    return-object v1

    .line 306
    nop

    .line 307
    :sswitch_data_0
    .sparse-switch
        -0x7eb7d598 -> :sswitch_8
        -0x7a3109a8 -> :sswitch_7
        -0x51863cdb -> :sswitch_6
        -0x25a686d8 -> :sswitch_5
        -0xf39bf95 -> :sswitch_4
        0x237a88eb -> :sswitch_3
        0x38b72420 -> :sswitch_2
        0x714f9fb5 -> :sswitch_1
        0x755ac2ae -> :sswitch_0
    .end sparse-switch
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lg5/h;->a:Lcom/web2native/MainActivity;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lk1/c;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const-string p1, "ALLOWED"

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-static {v0, p1}, Lk1/c;->i(Lcom/web2native/MainActivity;Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const-string p1, "NOT_ALLOWED"

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_1
    const-string p1, "PERMANENTLY_BLOCKED"

    .line 22
    .line 23
    return-object p1
.end method

.method public final c(Ljava/lang/String;)V
    .locals 5

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "android.settings.APPLICATION_DETAILS_SETTINGS"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lg5/h;->a:Lcom/web2native/MainActivity;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v3, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v4, "package:"

    .line 17
    .line 18
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    if-eqz p1, :cond_a

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    iget-object v3, p0, Lg5/h;->s:Le/g;

    .line 42
    .line 43
    sparse-switch v2, :sswitch_data_0

    .line 44
    .line 45
    .line 46
    goto/16 :goto_0

    .line 47
    .line 48
    :sswitch_0
    const-string v1, "bluetooth"

    .line 49
    .line 50
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_0

    .line 55
    .line 56
    goto/16 :goto_0

    .line 57
    .line 58
    :cond_0
    invoke-virtual {v3, v0}, Le/g;->u(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :sswitch_1
    const-string v1, "location"

    .line 63
    .line 64
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_1

    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :cond_1
    invoke-virtual {v3, v0}, Le/g;->u(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :sswitch_2
    const-string v1, "contact"

    .line 77
    .line 78
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_2

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :cond_2
    invoke-virtual {v3, v0}, Le/g;->u(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :sswitch_3
    const-string v0, "notification"

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-nez p1, :cond_3

    .line 97
    .line 98
    goto/16 :goto_0

    .line 99
    .line 100
    :cond_3
    new-instance p1, Landroid/content/Intent;

    .line 101
    .line 102
    const-string v0, "android.settings.APP_NOTIFICATION_SETTINGS"

    .line 103
    .line 104
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    const-string v0, "android.provider.extra.APP_PACKAGE"

    .line 108
    .line 109
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    const-string v0, "putExtra(...)"

    .line 118
    .line 119
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3, p1}, Le/g;->u(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :sswitch_4
    const-string v0, "enableBluetooth"

    .line 127
    .line 128
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-nez p1, :cond_4

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_4
    new-instance p1, Landroid/content/Intent;

    .line 136
    .line 137
    const-string v0, "android.bluetooth.adapter.action.REQUEST_ENABLE"

    .line 138
    .line 139
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3, p1}, Le/g;->u(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :sswitch_5
    const-string v1, "openSettings"

    .line 147
    .line 148
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-nez p1, :cond_5

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_5
    invoke-virtual {v3, v0}, Le/g;->u(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :sswitch_6
    const-string v0, "enableNfc"

    .line 160
    .line 161
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-nez p1, :cond_6

    .line 166
    .line 167
    goto :goto_0

    .line 168
    :cond_6
    new-instance p1, Landroid/content/Intent;

    .line 169
    .line 170
    const-string v0, "android.settings.NFC_SETTINGS"

    .line 171
    .line 172
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3, p1}, Le/g;->u(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :sswitch_7
    const-string v1, "camera"

    .line 180
    .line 181
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    if-nez p1, :cond_7

    .line 186
    .line 187
    goto :goto_0

    .line 188
    :cond_7
    invoke-virtual {v3, v0}, Le/g;->u(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :sswitch_8
    const-string v0, "enableLocation"

    .line 193
    .line 194
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    if-nez p1, :cond_8

    .line 199
    .line 200
    goto :goto_0

    .line 201
    :cond_8
    new-instance p1, Landroid/content/Intent;

    .line 202
    .line 203
    const-string v0, "android.settings.LOCATION_SOURCE_SETTINGS"

    .line 204
    .line 205
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v3, p1}, Le/g;->u(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    return-void

    .line 212
    :sswitch_9
    const-string v1, "record_audio"

    .line 213
    .line 214
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    if-nez p1, :cond_9

    .line 219
    .line 220
    goto :goto_0

    .line 221
    :cond_9
    invoke-virtual {v3, v0}, Le/g;->u(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    :cond_a
    :goto_0
    return-void

    .line 225
    :sswitch_data_0
    .sparse-switch
        -0x7eb7d598 -> :sswitch_9
        -0x7a3109a8 -> :sswitch_8
        -0x51863cdb -> :sswitch_7
        -0x25a686d8 -> :sswitch_6
        -0x162ca373 -> :sswitch_5
        -0xf39bf95 -> :sswitch_4
        0x237a88eb -> :sswitch_3
        0x38b72420 -> :sswitch_2
        0x714f9fb5 -> :sswitch_1
        0x755ac2ae -> :sswitch_0
    .end sparse-switch
.end method

.method public final d(Ljava/lang/String;)V
    .locals 10

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_e

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lg5/h;->e:Z

    .line 9
    .line 10
    iput-object p1, p0, Lg5/h;->t:Ljava/lang/String;

    .line 11
    .line 12
    iget-boolean v1, p0, Lg5/h;->u:Z

    .line 13
    .line 14
    if-eqz v1, :cond_d

    .line 15
    .line 16
    iget-object v1, p0, Lg5/h;->w:Lorg/json/JSONObject;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const-string v3, "title"

    .line 22
    .line 23
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-ne v1, v0, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, Lg5/h;->w:Lorg/json/JSONObject;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object v1, v2

    .line 39
    :goto_0
    iget-object v3, p0, Lg5/h;->w:Lorg/json/JSONObject;

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    const-string v4, "message"

    .line 44
    .line 45
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-ne v3, v0, :cond_1

    .line 50
    .line 51
    iget-object v3, p0, Lg5/h;->w:Lorg/json/JSONObject;

    .line 52
    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move-object v3, v2

    .line 61
    :goto_1
    iget-object v4, p0, Lg5/h;->w:Lorg/json/JSONObject;

    .line 62
    .line 63
    if-eqz v4, :cond_2

    .line 64
    .line 65
    const-string v5, "positiveButtonText"

    .line 66
    .line 67
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-ne v4, v0, :cond_2

    .line 72
    .line 73
    iget-object v4, p0, Lg5/h;->w:Lorg/json/JSONObject;

    .line 74
    .line 75
    if-eqz v4, :cond_2

    .line 76
    .line 77
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    move-object v4, v2

    .line 83
    :goto_2
    iget-object v5, p0, Lg5/h;->w:Lorg/json/JSONObject;

    .line 84
    .line 85
    if-eqz v5, :cond_3

    .line 86
    .line 87
    const-string v6, "negativeButtonText"

    .line 88
    .line 89
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-ne v5, v0, :cond_3

    .line 94
    .line 95
    iget-object v5, p0, Lg5/h;->w:Lorg/json/JSONObject;

    .line 96
    .line 97
    if-eqz v5, :cond_3

    .line 98
    .line 99
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    goto :goto_3

    .line 104
    :cond_3
    move-object v5, v2

    .line 105
    :goto_3
    new-instance v6, LI2/e;

    .line 106
    .line 107
    const/4 v7, 0x6

    .line 108
    invoke-direct {v6, v7, p0, p1}, LI2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    new-instance p1, LI2/d;

    .line 112
    .line 113
    const/16 v7, 0x11

    .line 114
    .line 115
    invoke-direct {p1, v7, p0}, LI2/d;-><init>(ILjava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    iget-object v7, p0, Lg5/h;->t:Ljava/lang/String;

    .line 119
    .line 120
    if-eqz v7, :cond_4

    .line 121
    .line 122
    const-string v8, "_"

    .line 123
    .line 124
    const-string v9, " "

    .line 125
    .line 126
    invoke-static {v7, v8, v9}, LJ5/t;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    goto :goto_4

    .line 131
    :cond_4
    const-string v7, ""

    .line 132
    .line 133
    :goto_4
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    if-lez v8, :cond_5

    .line 138
    .line 139
    const/4 v8, 0x0

    .line 140
    invoke-virtual {v7, v8}, Ljava/lang/String;->charAt(I)C

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    invoke-static {v8}, Ljava/lang/Character;->toUpperCase(C)C

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    invoke-virtual {v7, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    const-string v7, "substring(...)"

    .line 153
    .line 154
    invoke-static {v0, v7}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    new-instance v7, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    :cond_5
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-lez v0, :cond_6

    .line 177
    .line 178
    move-object v2, v7

    .line 179
    :cond_6
    if-eqz v2, :cond_7

    .line 180
    .line 181
    const-string v0, " Permission Required"

    .line 182
    .line 183
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    if-nez v0, :cond_8

    .line 188
    .line 189
    :cond_7
    const-string v0, "Permission Required"

    .line 190
    .line 191
    :cond_8
    new-instance v2, Landroid/app/AlertDialog$Builder;

    .line 192
    .line 193
    iget-object v7, p0, Lg5/h;->a:Lcom/web2native/MainActivity;

    .line 194
    .line 195
    invoke-direct {v2, v7}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 196
    .line 197
    .line 198
    if-nez v1, :cond_9

    .line 199
    .line 200
    move-object v1, v0

    .line 201
    :cond_9
    invoke-virtual {v2, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    if-nez v3, :cond_a

    .line 206
    .line 207
    const-string v3, "This feature requires permissions that have been denied. Would you like to open settings to grant them?"

    .line 208
    .line 209
    :cond_a
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    if-nez v4, :cond_b

    .line 214
    .line 215
    const-string v4, "Open Settings"

    .line 216
    .line 217
    :cond_b
    new-instance v1, LR4/g3;

    .line 218
    .line 219
    const/4 v2, 0x1

    .line 220
    invoke-direct {v1, v2, v6}, LR4/g3;-><init>(ILjava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v4, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    if-nez v5, :cond_c

    .line 228
    .line 229
    const-string v5, "Cancel"

    .line 230
    .line 231
    :cond_c
    new-instance v1, Lg5/f;

    .line 232
    .line 233
    invoke-direct {v1, p1, p0}, Lg5/f;-><init>(LI2/d;Lg5/h;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, v5, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    new-instance v1, Lg5/g;

    .line 241
    .line 242
    invoke-direct {v1, p1, p0}, Lg5/g;-><init>(LI2/d;Lg5/h;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 250
    .line 251
    .line 252
    return-void

    .line 253
    :cond_d
    invoke-virtual {p0, p1}, Lg5/h;->c(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    :cond_e
    return-void
.end method

.method public final e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg5/h;->g:Le/g;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    .line 7
    .line 8
    const-string v2, "android.permission.ACCESS_COARSE_LOCATION"

    .line 9
    .line 10
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Le/g;->u(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final f(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    iput-boolean p2, p0, Lg5/h;->e:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const-string p2, "w2n://"

    .line 6
    .line 7
    invoke-static {p1, p2}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    const/4 v0, 0x1

    .line 12
    if-ne p2, v0, :cond_0

    .line 13
    .line 14
    const-string p2, "w2n://permission-"

    .line 15
    .line 16
    invoke-static {p1, p2}, LJ5/m;->a1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :cond_0
    iput-object p1, p0, Lg5/h;->t:Ljava/lang/String;

    .line 21
    .line 22
    if-eqz p1, :cond_7

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    const/16 v0, 0x21

    .line 29
    .line 30
    sparse-switch p2, :sswitch_data_0

    .line 31
    .line 32
    .line 33
    goto/16 :goto_0

    .line 34
    .line 35
    :sswitch_0
    const-string p2, "bluetooth"

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_1

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 46
    .line 47
    const/16 p2, 0x1f

    .line 48
    .line 49
    iget-object v0, p0, Lg5/h;->x:Le/g;

    .line 50
    .line 51
    if-lt p1, p2, :cond_2

    .line 52
    .line 53
    if-eqz v0, :cond_7

    .line 54
    .line 55
    const-string p1, "android.permission.BLUETOOTH_SCAN"

    .line 56
    .line 57
    const-string p2, "android.permission.BLUETOOTH_CONNECT"

    .line 58
    .line 59
    filled-new-array {p1, p2}, [Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {v0, p1}, Le/g;->u(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_2
    if-eqz v0, :cond_7

    .line 68
    .line 69
    const-string p1, "android.permission.BLUETOOTH"

    .line 70
    .line 71
    const-string p2, "android.permission.BLUETOOTH_ADMIN"

    .line 72
    .line 73
    filled-new-array {p1, p2}, [Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {v0, p1}, Le/g;->u(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :sswitch_1
    const-string p2, "location"

    .line 82
    .line 83
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-nez p1, :cond_3

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    invoke-virtual {p0}, Lg5/h;->e()V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :sswitch_2
    const-string p2, "contact"

    .line 95
    .line 96
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-nez p1, :cond_4

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_4
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 104
    .line 105
    if-lt p1, v0, :cond_7

    .line 106
    .line 107
    iget-object p1, p0, Lg5/h;->m:Le/g;

    .line 108
    .line 109
    if-eqz p1, :cond_7

    .line 110
    .line 111
    const-string p2, "android.permission.READ_CONTACTS"

    .line 112
    .line 113
    invoke-virtual {p1, p2}, Le/g;->u(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :sswitch_3
    const-string p2, "notification"

    .line 118
    .line 119
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-nez p1, :cond_5

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_5
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 127
    .line 128
    if-lt p1, v0, :cond_7

    .line 129
    .line 130
    iget-object p1, p0, Lg5/h;->c:Le/g;

    .line 131
    .line 132
    if-eqz p1, :cond_7

    .line 133
    .line 134
    const-string p2, "android.permission.POST_NOTIFICATIONS"

    .line 135
    .line 136
    invoke-virtual {p1, p2}, Le/g;->u(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :sswitch_4
    const-string p2, "camera"

    .line 141
    .line 142
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-eqz p1, :cond_7

    .line 147
    .line 148
    iget-object p1, p0, Lg5/h;->l:Le/g;

    .line 149
    .line 150
    const-string p2, "android.permission.CAMERA"

    .line 151
    .line 152
    invoke-virtual {p1, p2}, Le/g;->u(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :sswitch_5
    const-string p2, "record_audio"

    .line 157
    .line 158
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-nez p1, :cond_6

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_6
    iget-object p1, p0, Lg5/h;->d:Le/g;

    .line 166
    .line 167
    if-eqz p1, :cond_7

    .line 168
    .line 169
    const-string p2, "android.permission.RECORD_AUDIO"

    .line 170
    .line 171
    invoke-virtual {p1, p2}, Le/g;->u(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    :cond_7
    :goto_0
    return-void

    .line 175
    :sswitch_data_0
    .sparse-switch
        -0x7eb7d598 -> :sswitch_5
        -0x51863cdb -> :sswitch_4
        0x237a88eb -> :sswitch_3
        0x38b72420 -> :sswitch_2
        0x714f9fb5 -> :sswitch_1
        0x755ac2ae -> :sswitch_0
    .end sparse-switch
.end method

.method public final g(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "permissionStatus"

    .line 2
    .line 3
    const-string v1, "typeValue"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, Lg5/h;->e:Z

    .line 9
    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eqz p2, :cond_2

    .line 13
    .line 14
    new-instance v1, Lorg/json/JSONObject;

    .line 15
    .line 16
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 17
    .line 18
    .line 19
    :try_start_0
    const-string v2, "type"

    .line 20
    .line 21
    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lg5/h;->f:Ljava/util/HashMap;

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    invoke-static {p1}, Ln5/x;->M(Ljava/util/HashMap;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ljava/lang/Iterable;

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_0

    .line 46
    .line 47
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    check-cast p2, Lm5/j;

    .line 52
    .line 53
    iget-object v0, p2, Lm5/j;->q:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Ljava/lang/String;

    .line 56
    .line 57
    iget-object p2, p2, Lm5/j;->r:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p2, Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catch_0
    move-exception p1

    .line 66
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 67
    .line 68
    .line 69
    :cond_0
    iget-object p1, p0, Lg5/h;->b:LR4/k1;

    .line 70
    .line 71
    iget-object p1, p1, LR4/k1;->H:LR4/l3;

    .line 72
    .line 73
    if-eqz p1, :cond_1

    .line 74
    .line 75
    invoke-virtual {p1, v1}, LR4/l3;->a(Lorg/json/JSONObject;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    const/4 p1, 0x0

    .line 79
    iput-object p1, p0, Lg5/h;->f:Ljava/util/HashMap;

    .line 80
    .line 81
    const/4 p2, 0x0

    .line 82
    iput-boolean p2, p0, Lg5/h;->e:Z

    .line 83
    .line 84
    iput-object p1, p0, Lg5/h;->t:Ljava/lang/String;

    .line 85
    .line 86
    iput-boolean p2, p0, Lg5/h;->u:Z

    .line 87
    .line 88
    iput-object p1, p0, Lg5/h;->v:Ljava/lang/String;

    .line 89
    .line 90
    :cond_2
    return-void
.end method

.method public final h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg5/h;->b:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->d:LR4/i;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, LR4/i;->t:Ljava/lang/Boolean;

    .line 8
    .line 9
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-eqz v0, :cond_1

    .line 18
    .line 19
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 20
    .line 21
    const/16 v1, 0x21

    .line 22
    .line 23
    if-lt v0, v1, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lg5/h;->c:Le/g;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    const-string v1, "android.permission.POST_NOTIFICATIONS"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Le/g;->u(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method
