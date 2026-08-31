.class public final synthetic LO3/A0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:LO3/a2;

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;

.field public final synthetic v:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LO3/C0;LO3/a2;Landroid/os/Bundle;LO3/K;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LO3/A0;->q:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO3/A0;->t:Ljava/lang/Object;

    iput-object p2, p0, LO3/A0;->s:LO3/a2;

    iput-object p3, p0, LO3/A0;->u:Ljava/lang/Object;

    iput-object p4, p0, LO3/A0;->v:Ljava/lang/Object;

    iput-object p5, p0, LO3/A0;->r:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(LO3/w1;Ljava/lang/String;Ljava/lang/String;LO3/a2;Lcom/google/android/gms/internal/measurement/L;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LO3/A0;->q:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LO3/A0;->r:Ljava/lang/String;

    iput-object p3, p0, LO3/A0;->t:Ljava/lang/Object;

    iput-object p4, p0, LO3/A0;->s:LO3/a2;

    iput-object p5, p0, LO3/A0;->u:Ljava/lang/Object;

    iput-object p1, p0, LO3/A0;->v:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LO3/w1;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;LO3/a2;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LO3/A0;->q:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LO3/A0;->t:Ljava/lang/Object;

    iput-object p3, p0, LO3/A0;->r:Ljava/lang/String;

    iput-object p4, p0, LO3/A0;->u:Ljava/lang/Object;

    iput-object p5, p0, LO3/A0;->s:LO3/a2;

    iput-object p1, p0, LO3/A0;->v:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, LO3/A0;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LO3/A0;->u:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/gms/internal/measurement/L;

    .line 9
    .line 10
    iget-object v1, p0, LO3/A0;->t:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/lang/String;

    .line 13
    .line 14
    iget-object v2, p0, LO3/A0;->r:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, p0, LO3/A0;->v:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, LO3/w1;

    .line 19
    .line 20
    new-instance v4, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    :try_start_0
    iget-object v5, v3, LO3/w1;->u:LO3/I;

    .line 26
    .line 27
    if-nez v5, :cond_0

    .line 28
    .line 29
    iget-object v5, v3, LO3/D0;->r:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v5, LO3/t0;

    .line 32
    .line 33
    iget-object v6, v5, LO3/t0;->v:LO3/X;

    .line 34
    .line 35
    invoke-static {v6}, LO3/t0;->l(LO3/E0;)V

    .line 36
    .line 37
    .line 38
    iget-object v6, v6, LO3/X;->w:LO3/V;

    .line 39
    .line 40
    const-string v7, "Failed to get conditional properties; not connected to service"

    .line 41
    .line 42
    invoke-virtual {v6, v2, v1, v7}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    iget-object v1, v5, LO3/t0;->y:LO3/Y1;

    .line 46
    .line 47
    :goto_0
    invoke-static {v1}, LO3/t0;->j(LO3/D0;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v0, v4}, LO3/Y1;->c0(Lcom/google/android/gms/internal/measurement/L;Ljava/util/ArrayList;)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_0
    :try_start_1
    iget-object v6, p0, LO3/A0;->s:LO3/a2;

    .line 55
    .line 56
    invoke-interface {v5, v2, v1, v6}, LO3/I;->z(Ljava/lang/String;Ljava/lang/String;LO3/a2;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-static {v5}, LO3/Y1;->d0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {v3}, LO3/w1;->B()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :catchall_0
    move-exception v1

    .line 69
    goto :goto_3

    .line 70
    :catch_0
    move-exception v5

    .line 71
    :try_start_2
    iget-object v6, v3, LO3/D0;->r:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v6, LO3/t0;

    .line 74
    .line 75
    iget-object v6, v6, LO3/t0;->v:LO3/X;

    .line 76
    .line 77
    invoke-static {v6}, LO3/t0;->l(LO3/E0;)V

    .line 78
    .line 79
    .line 80
    iget-object v6, v6, LO3/X;->w:LO3/V;

    .line 81
    .line 82
    const-string v7, "Failed to get conditional properties; remote exception"

    .line 83
    .line 84
    invoke-virtual {v6, v7, v2, v1, v5}, LO3/V;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 85
    .line 86
    .line 87
    :goto_1
    iget-object v1, v3, LO3/D0;->r:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v1, LO3/t0;

    .line 90
    .line 91
    iget-object v1, v1, LO3/t0;->y:LO3/Y1;

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :goto_2
    return-void

    .line 95
    :goto_3
    iget-object v2, v3, LO3/D0;->r:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v2, LO3/t0;

    .line 98
    .line 99
    iget-object v2, v2, LO3/t0;->y:LO3/Y1;

    .line 100
    .line 101
    invoke-static {v2}, LO3/t0;->j(LO3/D0;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v0, v4}, LO3/Y1;->c0(Lcom/google/android/gms/internal/measurement/L;Ljava/util/ArrayList;)V

    .line 105
    .line 106
    .line 107
    throw v1

    .line 108
    :pswitch_0
    iget-object v0, p0, LO3/A0;->t:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 111
    .line 112
    monitor-enter v0

    .line 113
    const/4 v1, 0x0

    .line 114
    :try_start_3
    iget-object v2, p0, LO3/A0;->v:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v2, LO3/w1;

    .line 117
    .line 118
    iget-object v3, v2, LO3/w1;->u:LO3/I;

    .line 119
    .line 120
    if-nez v3, :cond_1

    .line 121
    .line 122
    iget-object v2, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v2, LO3/t0;

    .line 125
    .line 126
    iget-object v2, v2, LO3/t0;->v:LO3/X;

    .line 127
    .line 128
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 129
    .line 130
    .line 131
    iget-object v2, v2, LO3/X;->w:LO3/V;

    .line 132
    .line 133
    const-string v3, "(legacy) Failed to get conditional properties; not connected to service"

    .line 134
    .line 135
    iget-object v4, p0, LO3/A0;->r:Ljava/lang/String;

    .line 136
    .line 137
    iget-object v5, p0, LO3/A0;->u:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v5, Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {v2, v3, v1, v4, v5}, LO3/V;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 145
    .line 146
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 147
    .line 148
    .line 149
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 150
    .line 151
    .line 152
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 153
    goto :goto_8

    .line 154
    :catchall_1
    move-exception v1

    .line 155
    goto :goto_a

    .line 156
    :catchall_2
    move-exception v1

    .line 157
    goto :goto_9

    .line 158
    :catch_1
    move-exception v2

    .line 159
    goto :goto_6

    .line 160
    :cond_1
    :try_start_5
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    if-eqz v4, :cond_2

    .line 165
    .line 166
    iget-object v4, p0, LO3/A0;->s:LO3/a2;

    .line 167
    .line 168
    iget-object v5, p0, LO3/A0;->r:Ljava/lang/String;

    .line 169
    .line 170
    iget-object v6, p0, LO3/A0;->u:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v6, Ljava/lang/String;

    .line 173
    .line 174
    invoke-interface {v3, v5, v6, v4}, LO3/I;->z(Ljava/lang/String;Ljava/lang/String;LO3/a2;)Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_2
    iget-object v4, p0, LO3/A0;->r:Ljava/lang/String;

    .line 183
    .line 184
    iget-object v5, p0, LO3/A0;->u:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v5, Ljava/lang/String;

    .line 187
    .line 188
    invoke-interface {v3, v1, v4, v5}, LO3/I;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    :goto_4
    invoke-virtual {v2}, LO3/w1;->B()V
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 196
    .line 197
    .line 198
    :try_start_6
    iget-object v1, p0, LO3/A0;->t:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 201
    .line 202
    :goto_5
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 203
    .line 204
    .line 205
    goto :goto_7

    .line 206
    :goto_6
    :try_start_7
    iget-object v3, p0, LO3/A0;->v:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v3, LO3/w1;

    .line 209
    .line 210
    iget-object v3, v3, LO3/D0;->r:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v3, LO3/t0;

    .line 213
    .line 214
    iget-object v3, v3, LO3/t0;->v:LO3/X;

    .line 215
    .line 216
    invoke-static {v3}, LO3/t0;->l(LO3/E0;)V

    .line 217
    .line 218
    .line 219
    iget-object v3, v3, LO3/X;->w:LO3/V;

    .line 220
    .line 221
    const-string v4, "(legacy) Failed to get conditional properties; remote exception"

    .line 222
    .line 223
    iget-object v5, p0, LO3/A0;->r:Ljava/lang/String;

    .line 224
    .line 225
    invoke-virtual {v3, v4, v1, v5, v2}, LO3/V;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    iget-object v1, p0, LO3/A0;->t:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 231
    .line 232
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 233
    .line 234
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 235
    .line 236
    .line 237
    :try_start_8
    iget-object v1, p0, LO3/A0;->t:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 240
    .line 241
    goto :goto_5

    .line 242
    :goto_7
    monitor-exit v0

    .line 243
    :goto_8
    return-void

    .line 244
    :goto_9
    iget-object v2, p0, LO3/A0;->t:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 247
    .line 248
    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 249
    .line 250
    .line 251
    throw v1

    .line 252
    :goto_a
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 253
    throw v1

    .line 254
    :pswitch_1
    iget-object v0, p0, LO3/A0;->t:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v0, LO3/C0;

    .line 257
    .line 258
    iget-object v1, p0, LO3/A0;->s:LO3/a2;

    .line 259
    .line 260
    iget-object v2, p0, LO3/A0;->u:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v2, Landroid/os/Bundle;

    .line 263
    .line 264
    iget-object v3, p0, LO3/A0;->v:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v3, LO3/K;

    .line 267
    .line 268
    iget-object v4, p0, LO3/A0;->r:Ljava/lang/String;

    .line 269
    .line 270
    iget-object v0, v0, LO3/C0;->c:LO3/T1;

    .line 271
    .line 272
    invoke-virtual {v0}, LO3/T1;->A()V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0, v1, v2}, LO3/T1;->b0(LO3/a2;Landroid/os/Bundle;)Ljava/util/List;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    :try_start_9
    invoke-interface {v3, v1}, LO3/K;->A(Ljava/util/List;)V
    :try_end_9
    .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_9} :catch_2

    .line 280
    .line 281
    .line 282
    goto :goto_b

    .line 283
    :catch_2
    move-exception v1

    .line 284
    invoke-virtual {v0}, LO3/T1;->b()LO3/X;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    iget-object v0, v0, LO3/X;->w:LO3/V;

    .line 289
    .line 290
    const-string v2, "Failed to return trigger URIs for app"

    .line 291
    .line 292
    invoke-virtual {v0, v4, v1, v2}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    :goto_b
    return-void

    .line 296
    nop

    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
