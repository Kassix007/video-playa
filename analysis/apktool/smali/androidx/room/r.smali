.class public final Landroidx/room/r;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Landroidx/room/m;


# instance fields
.field public final synthetic c:Landroidx/room/MultiInstanceInvalidationService;


# direct methods
.method public constructor <init>(Landroidx/room/MultiInstanceInvalidationService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/room/r;->c:Landroidx/room/MultiInstanceInvalidationService;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object p1, Landroidx/room/m;->b:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 7

    .line 1
    sget-object v0, Landroidx/room/m;->b:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-lt p1, v1, :cond_0

    .line 5
    .line 6
    const v2, 0xffffff

    .line 7
    .line 8
    .line 9
    if-gt p1, v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const v2, 0x5f4e5446

    .line 15
    .line 16
    .line 17
    if-ne p1, v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return v1

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    if-eq p1, v1, :cond_a

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    if-eq p1, v2, :cond_7

    .line 28
    .line 29
    const/4 v0, 0x3

    .line 30
    if-eq p1, v0, :cond_2

    .line 31
    .line 32
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1

    .line 37
    :cond_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const-string p3, "tables"

    .line 46
    .line 47
    invoke-static {p2, p3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-object p3, p0, Landroidx/room/r;->c:Landroidx/room/MultiInstanceInvalidationService;

    .line 51
    .line 52
    iget-object p4, p3, Landroidx/room/MultiInstanceInvalidationService;->s:Landroidx/room/s;

    .line 53
    .line 54
    monitor-enter p4

    .line 55
    :try_start_0
    iget-object v0, p3, Landroidx/room/MultiInstanceInvalidationService;->r:Ljava/util/LinkedHashMap;

    .line 56
    .line 57
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Ljava/lang/String;

    .line 66
    .line 67
    if-nez v0, :cond_3

    .line 68
    .line 69
    const-string p1, "ROOM"

    .line 70
    .line 71
    const-string p2, "Remote invalidation client ID not registered"

    .line 72
    .line 73
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    .line 76
    monitor-exit p4

    .line 77
    goto :goto_3

    .line 78
    :catchall_0
    move-exception p1

    .line 79
    goto :goto_4

    .line 80
    :cond_3
    :try_start_1
    iget-object v2, p3, Landroidx/room/MultiInstanceInvalidationService;->s:Landroidx/room/s;

    .line 81
    .line 82
    invoke-virtual {v2}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    .line 83
    .line 84
    .line 85
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    const/4 v3, 0x0

    .line 87
    :goto_0
    if-ge v3, v2, :cond_6

    .line 88
    .line 89
    :try_start_2
    iget-object v4, p3, Landroidx/room/MultiInstanceInvalidationService;->s:Landroidx/room/s;

    .line 90
    .line 91
    invoke-virtual {v4, v3}, Landroid/os/RemoteCallbackList;->getBroadcastCookie(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    const-string v5, "null cannot be cast to non-null type kotlin.Int"

    .line 96
    .line 97
    invoke-static {v4, v5}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    check-cast v4, Ljava/lang/Integer;

    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    iget-object v6, p3, Landroidx/room/MultiInstanceInvalidationService;->r:Ljava/util/LinkedHashMap;

    .line 107
    .line 108
    invoke-virtual {v6, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    check-cast v4, Ljava/lang/String;

    .line 113
    .line 114
    if-eq p1, v5, :cond_5

    .line 115
    .line 116
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 120
    if-nez v4, :cond_4

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_4
    :try_start_3
    iget-object v4, p3, Landroidx/room/MultiInstanceInvalidationService;->s:Landroidx/room/s;

    .line 124
    .line 125
    invoke-virtual {v4, v3}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    check-cast v4, Landroidx/room/l;

    .line 130
    .line 131
    invoke-interface {v4, p2}, Landroidx/room/l;->o([Ljava/lang/String;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :catchall_1
    move-exception p1

    .line 136
    goto :goto_2

    .line 137
    :catch_0
    move-exception v4

    .line 138
    :try_start_4
    const-string v5, "ROOM"

    .line 139
    .line 140
    const-string v6, "Error invoking a remote callback"

    .line 141
    .line 142
    invoke-static {v5, v6, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 143
    .line 144
    .line 145
    :cond_5
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :goto_2
    :try_start_5
    iget-object p2, p3, Landroidx/room/MultiInstanceInvalidationService;->s:Landroidx/room/s;

    .line 149
    .line 150
    invoke-virtual {p2}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 151
    .line 152
    .line 153
    throw p1

    .line 154
    :cond_6
    iget-object p1, p3, Landroidx/room/MultiInstanceInvalidationService;->s:Landroidx/room/s;

    .line 155
    .line 156
    invoke-virtual {p1}, Landroid/os/RemoteCallbackList;->finishBroadcast()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 157
    .line 158
    .line 159
    monitor-exit p4

    .line 160
    :goto_3
    return v1

    .line 161
    :goto_4
    monitor-exit p4

    .line 162
    throw p1

    .line 163
    :cond_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    if-nez p1, :cond_8

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_8
    sget-object p4, Landroidx/room/l;->a:Ljava/lang/String;

    .line 171
    .line 172
    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 173
    .line 174
    .line 175
    move-result-object p4

    .line 176
    if-eqz p4, :cond_9

    .line 177
    .line 178
    instance-of v0, p4, Landroidx/room/l;

    .line 179
    .line 180
    if-eqz v0, :cond_9

    .line 181
    .line 182
    move-object v0, p4

    .line 183
    check-cast v0, Landroidx/room/l;

    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_9
    new-instance v0, Landroidx/room/k;

    .line 187
    .line 188
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 189
    .line 190
    .line 191
    iput-object p1, v0, Landroidx/room/k;->c:Landroid/os/IBinder;

    .line 192
    .line 193
    :goto_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    const-string p2, "callback"

    .line 198
    .line 199
    invoke-static {v0, p2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    iget-object p2, p0, Landroidx/room/r;->c:Landroidx/room/MultiInstanceInvalidationService;

    .line 203
    .line 204
    iget-object p4, p2, Landroidx/room/MultiInstanceInvalidationService;->s:Landroidx/room/s;

    .line 205
    .line 206
    monitor-enter p4

    .line 207
    :try_start_6
    iget-object v2, p2, Landroidx/room/MultiInstanceInvalidationService;->s:Landroidx/room/s;

    .line 208
    .line 209
    invoke-virtual {v2, v0}, Landroid/os/RemoteCallbackList;->unregister(Landroid/os/IInterface;)Z

    .line 210
    .line 211
    .line 212
    iget-object p2, p2, Landroidx/room/MultiInstanceInvalidationService;->r:Ljava/util/LinkedHashMap;

    .line 213
    .line 214
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    check-cast p1, Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 223
    .line 224
    monitor-exit p4

    .line 225
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 226
    .line 227
    .line 228
    return v1

    .line 229
    :catchall_2
    move-exception p1

    .line 230
    monitor-exit p4

    .line 231
    throw p1

    .line 232
    :cond_a
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    if-nez p1, :cond_b

    .line 237
    .line 238
    goto :goto_6

    .line 239
    :cond_b
    sget-object p4, Landroidx/room/l;->a:Ljava/lang/String;

    .line 240
    .line 241
    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 242
    .line 243
    .line 244
    move-result-object p4

    .line 245
    if-eqz p4, :cond_c

    .line 246
    .line 247
    instance-of v0, p4, Landroidx/room/l;

    .line 248
    .line 249
    if-eqz v0, :cond_c

    .line 250
    .line 251
    move-object v0, p4

    .line 252
    check-cast v0, Landroidx/room/l;

    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_c
    new-instance v0, Landroidx/room/k;

    .line 256
    .line 257
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 258
    .line 259
    .line 260
    iput-object p1, v0, Landroidx/room/k;->c:Landroid/os/IBinder;

    .line 261
    .line 262
    :goto_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    const-string p2, "callback"

    .line 267
    .line 268
    invoke-static {v0, p2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    const/4 p2, 0x0

    .line 272
    if-nez p1, :cond_d

    .line 273
    .line 274
    goto :goto_8

    .line 275
    :cond_d
    iget-object p4, p0, Landroidx/room/r;->c:Landroidx/room/MultiInstanceInvalidationService;

    .line 276
    .line 277
    iget-object v2, p4, Landroidx/room/MultiInstanceInvalidationService;->s:Landroidx/room/s;

    .line 278
    .line 279
    monitor-enter v2

    .line 280
    :try_start_7
    iget v3, p4, Landroidx/room/MultiInstanceInvalidationService;->q:I

    .line 281
    .line 282
    add-int/2addr v3, v1

    .line 283
    iput v3, p4, Landroidx/room/MultiInstanceInvalidationService;->q:I

    .line 284
    .line 285
    iget-object v4, p4, Landroidx/room/MultiInstanceInvalidationService;->s:Landroidx/room/s;

    .line 286
    .line 287
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    invoke-virtual {v4, v0, v5}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-eqz v0, :cond_e

    .line 296
    .line 297
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 298
    .line 299
    .line 300
    move-result-object p2

    .line 301
    iget-object p4, p4, Landroidx/room/MultiInstanceInvalidationService;->r:Ljava/util/LinkedHashMap;

    .line 302
    .line 303
    invoke-interface {p4, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move p2, v3

    .line 307
    goto :goto_7

    .line 308
    :catchall_3
    move-exception p1

    .line 309
    goto :goto_9

    .line 310
    :cond_e
    iget p1, p4, Landroidx/room/MultiInstanceInvalidationService;->q:I

    .line 311
    .line 312
    add-int/lit8 p1, p1, -0x1

    .line 313
    .line 314
    iput p1, p4, Landroidx/room/MultiInstanceInvalidationService;->q:I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 315
    .line 316
    :goto_7
    monitor-exit v2

    .line 317
    :goto_8
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p3, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 321
    .line 322
    .line 323
    return v1

    .line 324
    :goto_9
    monitor-exit v2

    .line 325
    throw p1
.end method
