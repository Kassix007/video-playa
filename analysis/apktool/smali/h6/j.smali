.class public final Lh6/j;
.super Lk6/h;
.source "SourceFile"


# instance fields
.field public final b:Ld6/x;

.field public c:Ljava/net/Socket;

.field public d:Ljava/net/Socket;

.field public e:Ld6/k;

.field public f:Ld6/r;

.field public g:Lk6/n;

.field public h:Lq6/A;

.field public i:Lq6/z;

.field public j:Z

.field public k:Z

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public final p:Ljava/util/ArrayList;

.field public q:J


# direct methods
.method public constructor <init>(LO3/Y;Ld6/x;)V
    .locals 1

    .line 1
    const-string v0, "connectionPool"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "route"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lh6/j;->b:Ld6/x;

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput p1, p0, Lh6/j;->o:I

    .line 18
    .line 19
    new-instance p1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lh6/j;->p:Ljava/util/ArrayList;

    .line 25
    .line 26
    const-wide p1, 0x7fffffffffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    iput-wide p1, p0, Lh6/j;->q:J

    .line 32
    .line 33
    return-void
.end method

.method public static d(Ld6/q;Ld6/x;Ljava/io/IOException;)V
    .locals 3

    .line 1
    const-string v0, "failedRoute"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "failure"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, Ld6/x;->b:Ljava/net/Proxy;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 18
    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    iget-object v0, p1, Ld6/x;->a:Ld6/a;

    .line 22
    .line 23
    iget-object v1, v0, Ld6/a;->g:Ljava/net/ProxySelector;

    .line 24
    .line 25
    iget-object v0, v0, Ld6/a;->h:Ld6/n;

    .line 26
    .line 27
    invoke-virtual {v0}, Ld6/n;->g()Ljava/net/URI;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v2, p1, Ld6/x;->b:Ljava/net/Proxy;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1, v0, v2, p2}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    iget-object p0, p0, Ld6/q;->O:Lk3/d;

    .line 41
    .line 42
    monitor-enter p0

    .line 43
    :try_start_0
    iget-object p2, p0, Lk3/d;->r:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p2, Ljava/util/LinkedHashSet;

    .line 46
    .line 47
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    monitor-exit p0

    .line 51
    return-void

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    throw p1
.end method


# virtual methods
.method public final declared-synchronized a(Lk6/n;Lk6/z;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string p1, "settings"

    .line 3
    .line 4
    invoke-static {p2, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget p1, p2, Lk6/z;->a:I

    .line 8
    .line 9
    and-int/lit8 p1, p1, 0x10

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p2, Lk6/z;->b:[I

    .line 14
    .line 15
    const/4 p2, 0x4

    .line 16
    aget p1, p1, p2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const p1, 0x7fffffff

    .line 20
    .line 21
    .line 22
    :goto_0
    iput p1, p0, Lh6/j;->o:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    monitor-exit p0

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw p1
.end method

.method public final b(Lk6/v;)V
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Lk6/v;->c(ILjava/io/IOException;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final c(IIIZLh6/h;)V
    .locals 7

    .line 1
    const-string v0, "inetSocketAddress"

    .line 2
    .line 3
    iget-object v1, p0, Lh6/j;->f:Ld6/r;

    .line 4
    .line 5
    if-nez v1, :cond_e

    .line 6
    .line 7
    iget-object v1, p0, Lh6/j;->b:Ld6/x;

    .line 8
    .line 9
    iget-object v1, v1, Ld6/x;->a:Ld6/a;

    .line 10
    .line 11
    iget-object v1, v1, Ld6/a;->j:Ljava/util/List;

    .line 12
    .line 13
    new-instance v2, LO3/V;

    .line 14
    .line 15
    invoke-direct {v2, v1}, LO3/V;-><init>(Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    iget-object v3, p0, Lh6/j;->b:Ld6/x;

    .line 19
    .line 20
    iget-object v3, v3, Ld6/x;->a:Ld6/a;

    .line 21
    .line 22
    iget-object v4, v3, Ld6/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 23
    .line 24
    if-nez v4, :cond_2

    .line 25
    .line 26
    sget-object v3, Ld6/i;->f:Ld6/i;

    .line 27
    .line 28
    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    iget-object v1, p0, Lh6/j;->b:Ld6/x;

    .line 35
    .line 36
    iget-object v1, v1, Ld6/x;->a:Ld6/a;

    .line 37
    .line 38
    iget-object v1, v1, Ld6/a;->h:Ld6/n;

    .line 39
    .line 40
    iget-object v1, v1, Ld6/n;->d:Ljava/lang/String;

    .line 41
    .line 42
    sget-object v3, Ll6/m;->a:Ll6/m;

    .line 43
    .line 44
    sget-object v3, Ll6/m;->a:Ll6/m;

    .line 45
    .line 46
    invoke-virtual {v3, v1}, Ll6/m;->h(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-instance p1, Lh6/k;

    .line 54
    .line 55
    new-instance p2, Ljava/net/UnknownServiceException;

    .line 56
    .line 57
    const-string p3, "CLEARTEXT communication to "

    .line 58
    .line 59
    const-string p4, " not permitted by network security policy"

    .line 60
    .line 61
    invoke-static {p3, v1, p4}, LC0/S;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    invoke-direct {p2, p3}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-direct {p1, p2}, Lh6/k;-><init>(Ljava/io/IOException;)V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :cond_1
    new-instance p1, Lh6/k;

    .line 73
    .line 74
    new-instance p2, Ljava/net/UnknownServiceException;

    .line 75
    .line 76
    const-string p3, "CLEARTEXT communication not enabled for client"

    .line 77
    .line 78
    invoke-direct {p2, p3}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p1, p2}, Lh6/k;-><init>(Ljava/io/IOException;)V

    .line 82
    .line 83
    .line 84
    throw p1

    .line 85
    :cond_2
    iget-object v1, v3, Ld6/a;->i:Ljava/util/List;

    .line 86
    .line 87
    sget-object v3, Ld6/r;->v:Ld6/r;

    .line 88
    .line 89
    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_d

    .line 94
    .line 95
    :goto_0
    const/4 v1, 0x0

    .line 96
    move-object v3, v1

    .line 97
    :goto_1
    const/4 v4, 0x1

    .line 98
    :try_start_0
    iget-object v5, p0, Lh6/j;->b:Ld6/x;

    .line 99
    .line 100
    iget-object v6, v5, Ld6/x;->a:Ld6/a;

    .line 101
    .line 102
    iget-object v6, v6, Ld6/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 103
    .line 104
    if-eqz v6, :cond_3

    .line 105
    .line 106
    iget-object v5, v5, Ld6/x;->b:Ljava/net/Proxy;

    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    sget-object v6, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 113
    .line 114
    if-ne v5, v6, :cond_3

    .line 115
    .line 116
    move v5, v4

    .line 117
    goto :goto_2

    .line 118
    :cond_3
    const/4 v5, 0x0

    .line 119
    :goto_2
    if-eqz v5, :cond_4

    .line 120
    .line 121
    invoke-virtual {p0, p1, p2, p3, p5}, Lh6/j;->f(IIILh6/h;)V

    .line 122
    .line 123
    .line 124
    iget-object v5, p0, Lh6/j;->c:Ljava/net/Socket;

    .line 125
    .line 126
    if-nez v5, :cond_5

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :catch_0
    move-exception v5

    .line 130
    goto :goto_5

    .line 131
    :cond_4
    invoke-virtual {p0, p1, p2, p5}, Lh6/j;->e(IILh6/h;)V

    .line 132
    .line 133
    .line 134
    :cond_5
    invoke-virtual {p0, v2, p5}, Lh6/j;->g(LO3/V;Lh6/h;)V

    .line 135
    .line 136
    .line 137
    iget-object v5, p0, Lh6/j;->b:Ld6/x;

    .line 138
    .line 139
    iget-object v5, v5, Ld6/x;->c:Ljava/net/InetSocketAddress;

    .line 140
    .line 141
    invoke-static {v5, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 142
    .line 143
    .line 144
    :goto_3
    iget-object p1, p0, Lh6/j;->b:Ld6/x;

    .line 145
    .line 146
    iget-object p2, p1, Ld6/x;->a:Ld6/a;

    .line 147
    .line 148
    iget-object p2, p2, Ld6/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 149
    .line 150
    if-eqz p2, :cond_7

    .line 151
    .line 152
    iget-object p1, p1, Ld6/x;->b:Ljava/net/Proxy;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    sget-object p2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 159
    .line 160
    if-ne p1, p2, :cond_7

    .line 161
    .line 162
    iget-object p1, p0, Lh6/j;->c:Ljava/net/Socket;

    .line 163
    .line 164
    if-eqz p1, :cond_6

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_6
    new-instance p1, Lh6/k;

    .line 168
    .line 169
    new-instance p2, Ljava/net/ProtocolException;

    .line 170
    .line 171
    const-string p3, "Too many tunnel connections attempted: 21"

    .line 172
    .line 173
    invoke-direct {p2, p3}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-direct {p1, p2}, Lh6/k;-><init>(Ljava/io/IOException;)V

    .line 177
    .line 178
    .line 179
    throw p1

    .line 180
    :cond_7
    :goto_4
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 181
    .line 182
    .line 183
    move-result-wide p1

    .line 184
    iput-wide p1, p0, Lh6/j;->q:J

    .line 185
    .line 186
    return-void

    .line 187
    :goto_5
    iget-object v6, p0, Lh6/j;->d:Ljava/net/Socket;

    .line 188
    .line 189
    if-eqz v6, :cond_8

    .line 190
    .line 191
    invoke-static {v6}, Le6/b;->c(Ljava/net/Socket;)V

    .line 192
    .line 193
    .line 194
    :cond_8
    iget-object v6, p0, Lh6/j;->c:Ljava/net/Socket;

    .line 195
    .line 196
    if-eqz v6, :cond_9

    .line 197
    .line 198
    invoke-static {v6}, Le6/b;->c(Ljava/net/Socket;)V

    .line 199
    .line 200
    .line 201
    :cond_9
    iput-object v1, p0, Lh6/j;->d:Ljava/net/Socket;

    .line 202
    .line 203
    iput-object v1, p0, Lh6/j;->c:Ljava/net/Socket;

    .line 204
    .line 205
    iput-object v1, p0, Lh6/j;->h:Lq6/A;

    .line 206
    .line 207
    iput-object v1, p0, Lh6/j;->i:Lq6/z;

    .line 208
    .line 209
    iput-object v1, p0, Lh6/j;->e:Ld6/k;

    .line 210
    .line 211
    iput-object v1, p0, Lh6/j;->f:Ld6/r;

    .line 212
    .line 213
    iput-object v1, p0, Lh6/j;->g:Lk6/n;

    .line 214
    .line 215
    iput v4, p0, Lh6/j;->o:I

    .line 216
    .line 217
    iget-object v6, p0, Lh6/j;->b:Ld6/x;

    .line 218
    .line 219
    iget-object v6, v6, Ld6/x;->c:Ljava/net/InetSocketAddress;

    .line 220
    .line 221
    invoke-static {v6, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    if-nez v3, :cond_a

    .line 225
    .line 226
    new-instance v3, Lh6/k;

    .line 227
    .line 228
    invoke-direct {v3, v5}, Lh6/k;-><init>(Ljava/io/IOException;)V

    .line 229
    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_a
    iget-object v6, v3, Lh6/k;->q:Ljava/io/IOException;

    .line 233
    .line 234
    invoke-static {v6, v5}, Lm5/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 235
    .line 236
    .line 237
    iput-object v5, v3, Lh6/k;->r:Ljava/io/IOException;

    .line 238
    .line 239
    :goto_6
    if-eqz p4, :cond_c

    .line 240
    .line 241
    iput-boolean v4, v2, LO3/V;->c:Z

    .line 242
    .line 243
    iget-boolean v4, v2, LO3/V;->b:Z

    .line 244
    .line 245
    if-eqz v4, :cond_c

    .line 246
    .line 247
    instance-of v4, v5, Ljava/net/ProtocolException;

    .line 248
    .line 249
    if-nez v4, :cond_c

    .line 250
    .line 251
    instance-of v4, v5, Ljava/io/InterruptedIOException;

    .line 252
    .line 253
    if-nez v4, :cond_c

    .line 254
    .line 255
    instance-of v4, v5, Ljavax/net/ssl/SSLHandshakeException;

    .line 256
    .line 257
    if-eqz v4, :cond_b

    .line 258
    .line 259
    invoke-virtual {v5}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    instance-of v4, v4, Ljava/security/cert/CertificateException;

    .line 264
    .line 265
    if-nez v4, :cond_c

    .line 266
    .line 267
    :cond_b
    instance-of v4, v5, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 268
    .line 269
    if-nez v4, :cond_c

    .line 270
    .line 271
    instance-of v4, v5, Ljavax/net/ssl/SSLException;

    .line 272
    .line 273
    if-eqz v4, :cond_c

    .line 274
    .line 275
    goto/16 :goto_1

    .line 276
    .line 277
    :cond_c
    throw v3

    .line 278
    :cond_d
    new-instance p1, Lh6/k;

    .line 279
    .line 280
    new-instance p2, Ljava/net/UnknownServiceException;

    .line 281
    .line 282
    const-string p3, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    .line 283
    .line 284
    invoke-direct {p2, p3}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-direct {p1, p2}, Lh6/k;-><init>(Ljava/io/IOException;)V

    .line 288
    .line 289
    .line 290
    throw p1

    .line 291
    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 292
    .line 293
    const-string p2, "already connected"

    .line 294
    .line 295
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    throw p1
.end method

.method public final e(IILh6/h;)V
    .locals 3

    .line 1
    iget-object p3, p0, Lh6/j;->b:Ld6/x;

    .line 2
    .line 3
    iget-object v0, p3, Ld6/x;->b:Ljava/net/Proxy;

    .line 4
    .line 5
    iget-object p3, p3, Ld6/x;->a:Ld6/a;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v2, Lh6/i;->a:[I

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    aget v1, v2, v1

    .line 22
    .line 23
    :goto_0
    const/4 v2, 0x1

    .line 24
    if-eq v1, v2, :cond_1

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    if-eq v1, v2, :cond_1

    .line 28
    .line 29
    new-instance p3, Ljava/net/Socket;

    .line 30
    .line 31
    invoke-direct {p3, v0}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object p3, p3, Ld6/a;->b:Ljavax/net/SocketFactory;

    .line 36
    .line 37
    invoke-virtual {p3}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    invoke-static {p3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :goto_1
    iput-object p3, p0, Lh6/j;->c:Ljava/net/Socket;

    .line 45
    .line 46
    iget-object v0, p0, Lh6/j;->b:Ld6/x;

    .line 47
    .line 48
    iget-object v0, v0, Ld6/x;->c:Ljava/net/InetSocketAddress;

    .line 49
    .line 50
    const-string v1, "inetSocketAddress"

    .line 51
    .line 52
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 56
    .line 57
    .line 58
    :try_start_0
    sget-object p2, Ll6/m;->a:Ll6/m;

    .line 59
    .line 60
    sget-object p2, Ll6/m;->a:Ll6/m;

    .line 61
    .line 62
    iget-object v0, p0, Lh6/j;->b:Ld6/x;

    .line 63
    .line 64
    iget-object v0, v0, Ld6/x;->c:Ljava/net/InetSocketAddress;

    .line 65
    .line 66
    invoke-virtual {p2, p3, v0, p1}, Ll6/m;->e(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    .line 67
    .line 68
    .line 69
    :try_start_1
    invoke-static {p3}, La/a;->S(Ljava/net/Socket;)Lq6/c;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-static {p1}, La/a;->j(Lq6/G;)Lq6/A;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, p0, Lh6/j;->h:Lq6/A;

    .line 78
    .line 79
    invoke-static {p3}, La/a;->Q(Ljava/net/Socket;)Lq6/b;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1}, La/a;->i(Lq6/E;)Lq6/z;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iput-object p1, p0, Lh6/j;->i:Lq6/z;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 88
    .line 89
    return-void

    .line 90
    :catch_0
    move-exception p1

    .line 91
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    const-string p3, "throw with null exception"

    .line 96
    .line 97
    invoke-static {p2, p3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    if-nez p2, :cond_2

    .line 102
    .line 103
    return-void

    .line 104
    :cond_2
    new-instance p2, Ljava/io/IOException;

    .line 105
    .line 106
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    throw p2

    .line 110
    :catch_1
    move-exception p1

    .line 111
    new-instance p2, Ljava/net/ConnectException;

    .line 112
    .line 113
    new-instance p3, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    const-string v0, "Failed to connect to "

    .line 116
    .line 117
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    iget-object v0, p0, Lh6/j;->b:Ld6/x;

    .line 121
    .line 122
    iget-object v0, v0, Ld6/x;->c:Ljava/net/InetSocketAddress;

    .line 123
    .line 124
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p3

    .line 131
    invoke-direct {p2, p3}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 135
    .line 136
    .line 137
    throw p2
.end method

.method public final f(IIILh6/h;)V
    .locals 9

    .line 1
    new-instance v0, LL0/l;

    .line 2
    .line 3
    invoke-direct {v0}, LL0/l;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lh6/j;->b:Ld6/x;

    .line 7
    .line 8
    iget-object v2, v1, Ld6/x;->a:Ld6/a;

    .line 9
    .line 10
    iget-object v2, v2, Ld6/a;->h:Ld6/n;

    .line 11
    .line 12
    const-string v3, "url"

    .line 13
    .line 14
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object v2, v0, LL0/l;->b:Ljava/lang/Object;

    .line 18
    .line 19
    const-string v2, "CONNECT"

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-virtual {v0, v2, v3}, LL0/l;->o(Ljava/lang/String;Lk3/c;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, v1, Ld6/x;->a:Ld6/a;

    .line 26
    .line 27
    iget-object v2, v1, Ld6/a;->h:Ld6/n;

    .line 28
    .line 29
    const/4 v4, 0x1

    .line 30
    invoke-static {v2, v4}, Le6/b;->s(Ld6/n;Z)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v5, "Host"

    .line 35
    .line 36
    invoke-virtual {v0, v5, v2}, LL0/l;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v2, "Proxy-Connection"

    .line 40
    .line 41
    const-string v5, "Keep-Alive"

    .line 42
    .line 43
    invoke-virtual {v0, v2, v5}, LL0/l;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v2, "User-Agent"

    .line 47
    .line 48
    const-string v5, "okhttp/4.12.0"

    .line 49
    .line 50
    invoke-virtual {v0, v2, v5}, LL0/l;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, LL0/l;->c()Ld6/s;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    new-instance v2, Lc3/c;

    .line 58
    .line 59
    const/4 v5, 0x1

    .line 60
    invoke-direct {v2, v5}, Lc3/c;-><init>(I)V

    .line 61
    .line 62
    .line 63
    const-string v5, "Proxy-Authenticate"

    .line 64
    .line 65
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/P1;->h(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v6, "OkHttp-Preemptive"

    .line 69
    .line 70
    invoke-static {v6, v5}, Lcom/google/android/gms/internal/measurement/P1;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v5}, Lc3/c;->e(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v5, v6}, Lc3/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Lc3/c;->d()Ld6/l;

    .line 80
    .line 81
    .line 82
    iget-object v2, v1, Ld6/a;->f:Ld6/b;

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object v2, v0, Ld6/s;->a:Ld6/n;

    .line 88
    .line 89
    invoke-virtual {p0, p1, p2, p4}, Lh6/j;->e(IILh6/h;)V

    .line 90
    .line 91
    .line 92
    new-instance p1, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string p4, "CONNECT "

    .line 95
    .line 96
    invoke-direct {p1, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v2, v4}, Le6/b;->s(Ld6/n;Z)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p4

    .line 103
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string p4, " HTTP/1.1"

    .line 107
    .line 108
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    iget-object p4, p0, Lh6/j;->h:Lq6/A;

    .line 116
    .line 117
    invoke-static {p4}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iget-object v2, p0, Lh6/j;->i:Lq6/z;

    .line 121
    .line 122
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    new-instance v4, Lj6/f;

    .line 126
    .line 127
    invoke-direct {v4, v3, p0, p4, v2}, Lj6/f;-><init>(Ld6/q;Lh6/j;Lq6/A;Lq6/z;)V

    .line 128
    .line 129
    .line 130
    iget-object v3, p4, Lq6/A;->q:Lq6/G;

    .line 131
    .line 132
    invoke-interface {v3}, Lq6/G;->d()Lq6/I;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    int-to-long v5, p2

    .line 137
    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 138
    .line 139
    invoke-virtual {v3, v5, v6}, Lq6/I;->g(J)Lq6/I;

    .line 140
    .line 141
    .line 142
    iget-object p2, v2, Lq6/z;->q:Lq6/E;

    .line 143
    .line 144
    invoke-interface {p2}, Lq6/E;->d()Lq6/I;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    int-to-long v5, p3

    .line 149
    invoke-virtual {p2, v5, v6}, Lq6/I;->g(J)Lq6/I;

    .line 150
    .line 151
    .line 152
    iget-object p2, v0, Ld6/s;->c:Ld6/l;

    .line 153
    .line 154
    invoke-virtual {v4, p2, p1}, Lj6/f;->j(Ld6/l;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v4}, Lj6/f;->b()V

    .line 158
    .line 159
    .line 160
    const/4 p1, 0x0

    .line 161
    invoke-virtual {v4, p1}, Lj6/f;->f(Z)Ld6/t;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    iput-object v0, p1, Ld6/t;->a:Ld6/s;

    .line 169
    .line 170
    invoke-virtual {p1}, Ld6/t;->a()Ld6/u;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    iget p2, p1, Ld6/u;->t:I

    .line 175
    .line 176
    invoke-static {p1}, Le6/b;->h(Ld6/u;)J

    .line 177
    .line 178
    .line 179
    move-result-wide v5

    .line 180
    const-wide/16 v7, -0x1

    .line 181
    .line 182
    cmp-long p1, v5, v7

    .line 183
    .line 184
    if-nez p1, :cond_0

    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_0
    invoke-virtual {v4, v5, v6}, Lj6/f;->i(J)Lj6/d;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    const p3, 0x7fffffff

    .line 192
    .line 193
    .line 194
    invoke-static {p1, p3}, Le6/b;->q(Lq6/G;I)Z

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1}, Lj6/d;->close()V

    .line 198
    .line 199
    .line 200
    :goto_0
    const/16 p1, 0xc8

    .line 201
    .line 202
    if-eq p2, p1, :cond_2

    .line 203
    .line 204
    const/16 p1, 0x197

    .line 205
    .line 206
    if-ne p2, p1, :cond_1

    .line 207
    .line 208
    iget-object p1, v1, Ld6/a;->f:Ld6/b;

    .line 209
    .line 210
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    new-instance p1, Ljava/io/IOException;

    .line 214
    .line 215
    const-string p2, "Failed to authenticate with proxy"

    .line 216
    .line 217
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw p1

    .line 221
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 222
    .line 223
    const-string p3, "Unexpected response code for CONNECT: "

    .line 224
    .line 225
    invoke-static {p2, p3}, Lk1/i;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p2

    .line 229
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw p1

    .line 233
    :cond_2
    iget-object p1, p4, Lq6/A;->r:Lq6/g;

    .line 234
    .line 235
    invoke-virtual {p1}, Lq6/g;->e()Z

    .line 236
    .line 237
    .line 238
    move-result p1

    .line 239
    if-eqz p1, :cond_3

    .line 240
    .line 241
    iget-object p1, v2, Lq6/z;->r:Lq6/g;

    .line 242
    .line 243
    invoke-virtual {p1}, Lq6/g;->e()Z

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    if-eqz p1, :cond_3

    .line 248
    .line 249
    return-void

    .line 250
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 251
    .line 252
    const-string p2, "TLS tunnel buffered too many bytes!"

    .line 253
    .line 254
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    throw p1
.end method

.method public final g(LO3/V;Lh6/h;)V
    .locals 11

    .line 1
    sget-object p2, Ld6/r;->s:Ld6/r;

    .line 2
    .line 3
    iget-object v0, p0, Lh6/j;->b:Ld6/x;

    .line 4
    .line 5
    iget-object v0, v0, Ld6/x;->a:Ld6/a;

    .line 6
    .line 7
    iget-object v1, v0, Ld6/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget-object p1, v0, Ld6/a;->i:Ljava/util/List;

    .line 12
    .line 13
    sget-object v0, Ld6/r;->v:Ld6/r;

    .line 14
    .line 15
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Lh6/j;->c:Ljava/net/Socket;

    .line 22
    .line 23
    iput-object p1, p0, Lh6/j;->d:Ljava/net/Socket;

    .line 24
    .line 25
    iput-object v0, p0, Lh6/j;->f:Ld6/r;

    .line 26
    .line 27
    invoke-virtual {p0}, Lh6/j;->l()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget-object p1, p0, Lh6/j;->c:Ljava/net/Socket;

    .line 32
    .line 33
    iput-object p1, p0, Lh6/j;->d:Ljava/net/Socket;

    .line 34
    .line 35
    iput-object p2, p0, Lh6/j;->f:Ld6/r;

    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    const-string v2, "Hostname "

    .line 39
    .line 40
    const-string v3, "\n              |Hostname "

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    :try_start_0
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object v5, p0, Lh6/j;->c:Ljava/net/Socket;

    .line 47
    .line 48
    iget-object v6, v0, Ld6/a;->h:Ld6/n;

    .line 49
    .line 50
    iget-object v7, v6, Ld6/n;->d:Ljava/lang/String;

    .line 51
    .line 52
    iget v6, v6, Ld6/n;->e:I

    .line 53
    .line 54
    const/4 v8, 0x1

    .line 55
    invoke-virtual {v1, v5, v7, v6, v8}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const-string v5, "null cannot be cast to non-null type javax.net.ssl.SSLSocket"

    .line 60
    .line 61
    invoke-static {v1, v5}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    check-cast v1, Ljavax/net/ssl/SSLSocket;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 65
    .line 66
    :try_start_1
    invoke-virtual {p1, v1}, LO3/V;->a(Ljavax/net/ssl/SSLSocket;)Ld6/i;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget-boolean v5, p1, Ld6/i;->b:Z

    .line 71
    .line 72
    if-eqz v5, :cond_2

    .line 73
    .line 74
    sget-object v5, Ll6/m;->a:Ll6/m;

    .line 75
    .line 76
    sget-object v5, Ll6/m;->a:Ll6/m;

    .line 77
    .line 78
    iget-object v6, v0, Ld6/a;->h:Ld6/n;

    .line 79
    .line 80
    iget-object v6, v6, Ld6/n;->d:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v7, v0, Ld6/a;->i:Ljava/util/List;

    .line 83
    .line 84
    invoke-virtual {v5, v1, v6, v7}, Ll6/m;->d(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :catchall_0
    move-exception p1

    .line 89
    move-object v4, v1

    .line 90
    goto/16 :goto_1

    .line 91
    .line 92
    :cond_2
    :goto_0
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    const-string v6, "sslSocketSession"

    .line 100
    .line 101
    invoke-static {v5, v6}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/K1;->o(Ljavax/net/ssl/SSLSession;)Ld6/k;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    iget-object v7, v0, Ld6/a;->d:Ljavax/net/ssl/HostnameVerifier;

    .line 109
    .line 110
    invoke-static {v7}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object v8, v0, Ld6/a;->h:Ld6/n;

    .line 114
    .line 115
    iget-object v8, v8, Ld6/n;->d:Ljava/lang/String;

    .line 116
    .line 117
    invoke-interface {v7, v8, v5}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-nez v5, :cond_4

    .line 122
    .line 123
    invoke-virtual {v6}, Ld6/k;->a()Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    move-object p2, p1

    .line 128
    check-cast p2, Ljava/util/Collection;

    .line 129
    .line 130
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    if-nez p2, :cond_3

    .line 135
    .line 136
    const/4 p2, 0x0

    .line 137
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    const-string p2, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    .line 142
    .line 143
    invoke-static {p1, p2}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    check-cast p1, Ljava/security/cert/X509Certificate;

    .line 147
    .line 148
    new-instance p2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 149
    .line 150
    new-instance v2, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    iget-object v0, v0, Ld6/a;->h:Ld6/n;

    .line 156
    .line 157
    iget-object v0, v0, Ld6/n;->d:Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string v0, " not verified:\n              |    certificate: "

    .line 163
    .line 164
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    sget-object v0, Ld6/e;->c:Ld6/e;

    .line 168
    .line 169
    invoke-static {p1}, La/a;->J(Ljava/security/cert/X509Certificate;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string v0, "\n              |    DN: "

    .line 177
    .line 178
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-interface {v0}, Ljava/security/Principal;->getName()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    const-string v0, "\n              |    subjectAltNames: "

    .line 193
    .line 194
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    const/4 v0, 0x7

    .line 198
    invoke-static {p1, v0}, Lp6/c;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    const/4 v3, 0x2

    .line 203
    invoke-static {p1, v3}, Lp6/c;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    check-cast v0, Ljava/util/Collection;

    .line 208
    .line 209
    check-cast p1, Ljava/lang/Iterable;

    .line 210
    .line 211
    invoke-static {v0, p1}, Ln5/l;->u0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    const-string p1, "\n              "

    .line 219
    .line 220
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-static {p1}, LJ5/n;->y0(Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    invoke-direct {p2, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    throw p2

    .line 235
    :cond_3
    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 236
    .line 237
    new-instance p2, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    iget-object v0, v0, Ld6/a;->h:Ld6/n;

    .line 243
    .line 244
    iget-object v0, v0, Ld6/n;->d:Ljava/lang/String;

    .line 245
    .line 246
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    const-string v0, " not verified (no certificates)"

    .line 250
    .line 251
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object p2

    .line 258
    invoke-direct {p1, p2}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    throw p1

    .line 262
    :cond_4
    iget-object v2, v0, Ld6/a;->e:Ld6/e;

    .line 263
    .line 264
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    new-instance v3, Ld6/k;

    .line 268
    .line 269
    iget-object v5, v6, Ld6/k;->a:Ld6/y;

    .line 270
    .line 271
    iget-object v7, v6, Ld6/k;->b:Ld6/g;

    .line 272
    .line 273
    iget-object v8, v6, Ld6/k;->c:Ljava/util/List;

    .line 274
    .line 275
    new-instance v9, LC/k;

    .line 276
    .line 277
    const/16 v10, 0x8

    .line 278
    .line 279
    invoke-direct {v9, v2, v6, v0, v10}, LC/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 280
    .line 281
    .line 282
    invoke-direct {v3, v5, v7, v8, v9}, Ld6/k;-><init>(Ld6/y;Ld6/g;Ljava/util/List;LB5/a;)V

    .line 283
    .line 284
    .line 285
    iput-object v3, p0, Lh6/j;->e:Ld6/k;

    .line 286
    .line 287
    iget-object v0, v0, Ld6/a;->h:Ld6/n;

    .line 288
    .line 289
    iget-object v0, v0, Ld6/n;->d:Ljava/lang/String;

    .line 290
    .line 291
    new-instance v3, LA0/d;

    .line 292
    .line 293
    const/16 v5, 0x16

    .line 294
    .line 295
    invoke-direct {v3, v5, p0}, LA0/d;-><init>(ILjava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2, v0, v3}, Ld6/e;->a(Ljava/lang/String;LB5/a;)V

    .line 299
    .line 300
    .line 301
    iget-boolean p1, p1, Ld6/i;->b:Z

    .line 302
    .line 303
    if-eqz p1, :cond_5

    .line 304
    .line 305
    sget-object p1, Ll6/m;->a:Ll6/m;

    .line 306
    .line 307
    sget-object p1, Ll6/m;->a:Ll6/m;

    .line 308
    .line 309
    invoke-virtual {p1, v1}, Ll6/m;->f(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    :cond_5
    iput-object v1, p0, Lh6/j;->d:Ljava/net/Socket;

    .line 314
    .line 315
    invoke-static {v1}, La/a;->S(Ljava/net/Socket;)Lq6/c;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    invoke-static {p1}, La/a;->j(Lq6/G;)Lq6/A;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    iput-object p1, p0, Lh6/j;->h:Lq6/A;

    .line 324
    .line 325
    invoke-static {v1}, La/a;->Q(Ljava/net/Socket;)Lq6/b;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    invoke-static {p1}, La/a;->i(Lq6/E;)Lq6/z;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    iput-object p1, p0, Lh6/j;->i:Lq6/z;

    .line 334
    .line 335
    if-eqz v4, :cond_6

    .line 336
    .line 337
    invoke-static {v4}, Ll6/d;->n(Ljava/lang/String;)Ld6/r;

    .line 338
    .line 339
    .line 340
    move-result-object p2

    .line 341
    :cond_6
    iput-object p2, p0, Lh6/j;->f:Ld6/r;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 342
    .line 343
    sget-object p1, Ll6/m;->a:Ll6/m;

    .line 344
    .line 345
    sget-object p1, Ll6/m;->a:Ll6/m;

    .line 346
    .line 347
    invoke-virtual {p1, v1}, Ll6/m;->a(Ljavax/net/ssl/SSLSocket;)V

    .line 348
    .line 349
    .line 350
    iget-object p1, p0, Lh6/j;->f:Ld6/r;

    .line 351
    .line 352
    sget-object p2, Ld6/r;->u:Ld6/r;

    .line 353
    .line 354
    if-ne p1, p2, :cond_7

    .line 355
    .line 356
    invoke-virtual {p0}, Lh6/j;->l()V

    .line 357
    .line 358
    .line 359
    :cond_7
    return-void

    .line 360
    :catchall_1
    move-exception p1

    .line 361
    :goto_1
    if-eqz v4, :cond_8

    .line 362
    .line 363
    sget-object p2, Ll6/m;->a:Ll6/m;

    .line 364
    .line 365
    sget-object p2, Ll6/m;->a:Ll6/m;

    .line 366
    .line 367
    invoke-virtual {p2, v4}, Ll6/m;->a(Ljavax/net/ssl/SSLSocket;)V

    .line 368
    .line 369
    .line 370
    :cond_8
    if-eqz v4, :cond_9

    .line 371
    .line 372
    invoke-static {v4}, Le6/b;->c(Ljava/net/Socket;)V

    .line 373
    .line 374
    .line 375
    :cond_9
    throw p1
.end method

.method public final h(Ld6/a;Ljava/util/List;)Z
    .locals 9

    .line 1
    iget-object v0, p1, Ld6/a;->h:Ld6/n;

    .line 2
    .line 3
    sget-object v1, Le6/b;->a:[B

    .line 4
    .line 5
    iget-object v1, p0, Lh6/j;->p:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget v2, p0, Lh6/j;->o:I

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-ge v1, v2, :cond_9

    .line 15
    .line 16
    iget-boolean v1, p0, Lh6/j;->j:Z

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto/16 :goto_1

    .line 21
    .line 22
    :cond_0
    iget-object v1, p0, Lh6/j;->b:Ld6/x;

    .line 23
    .line 24
    iget-object v2, v1, Ld6/x;->a:Ld6/a;

    .line 25
    .line 26
    iget-object v4, v1, Ld6/x;->a:Ld6/a;

    .line 27
    .line 28
    invoke-virtual {v2, p1}, Ld6/a;->a(Ld6/a;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    goto/16 :goto_1

    .line 35
    .line 36
    :cond_1
    iget-object v2, v0, Ld6/n;->d:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v5, v0, Ld6/n;->d:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v6, v4, Ld6/a;->h:Ld6/n;

    .line 41
    .line 42
    iget-object v6, v6, Ld6/n;->d:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v2, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    const/4 v6, 0x1

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    return v6

    .line 52
    :cond_2
    iget-object v2, p0, Lh6/j;->g:Lk6/n;

    .line 53
    .line 54
    if-nez v2, :cond_3

    .line 55
    .line 56
    goto/16 :goto_1

    .line 57
    .line 58
    :cond_3
    if-eqz p2, :cond_9

    .line 59
    .line 60
    check-cast p2, Ljava/lang/Iterable;

    .line 61
    .line 62
    instance-of v2, p2, Ljava/util/Collection;

    .line 63
    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    move-object v2, p2

    .line 67
    check-cast v2, Ljava/util/Collection;

    .line 68
    .line 69
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_4

    .line 74
    .line 75
    goto/16 :goto_1

    .line 76
    .line 77
    :cond_4
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_9

    .line 86
    .line 87
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    check-cast v2, Ld6/x;

    .line 92
    .line 93
    iget-object v7, v2, Ld6/x;->b:Ljava/net/Proxy;

    .line 94
    .line 95
    invoke-virtual {v7}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    sget-object v8, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 100
    .line 101
    if-ne v7, v8, :cond_5

    .line 102
    .line 103
    iget-object v7, v1, Ld6/x;->b:Ljava/net/Proxy;

    .line 104
    .line 105
    invoke-virtual {v7}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    if-ne v7, v8, :cond_5

    .line 110
    .line 111
    iget-object v7, v1, Ld6/x;->c:Ljava/net/InetSocketAddress;

    .line 112
    .line 113
    iget-object v2, v2, Ld6/x;->c:Ljava/net/InetSocketAddress;

    .line 114
    .line 115
    invoke-static {v7, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_5

    .line 120
    .line 121
    iget-object p2, p1, Ld6/a;->d:Ljavax/net/ssl/HostnameVerifier;

    .line 122
    .line 123
    sget-object v1, Lp6/c;->a:Lp6/c;

    .line 124
    .line 125
    if-eq p2, v1, :cond_6

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_6
    sget-object p2, Le6/b;->a:[B

    .line 129
    .line 130
    iget-object p2, v4, Ld6/a;->h:Ld6/n;

    .line 131
    .line 132
    iget v0, v0, Ld6/n;->e:I

    .line 133
    .line 134
    iget v1, p2, Ld6/n;->e:I

    .line 135
    .line 136
    if-eq v0, v1, :cond_7

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_7
    iget-object p2, p2, Ld6/n;->d:Ljava/lang/String;

    .line 140
    .line 141
    invoke-static {v5, p2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result p2

    .line 145
    if-eqz p2, :cond_8

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_8
    iget-boolean p2, p0, Lh6/j;->k:Z

    .line 149
    .line 150
    if-nez p2, :cond_9

    .line 151
    .line 152
    iget-object p2, p0, Lh6/j;->e:Ld6/k;

    .line 153
    .line 154
    if-eqz p2, :cond_9

    .line 155
    .line 156
    invoke-virtual {p2}, Ld6/k;->a()Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    move-object v0, p2

    .line 161
    check-cast v0, Ljava/util/Collection;

    .line 162
    .line 163
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-nez v0, :cond_9

    .line 168
    .line 169
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    const-string v0, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    .line 174
    .line 175
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    check-cast p2, Ljava/security/cert/X509Certificate;

    .line 179
    .line 180
    invoke-static {v5, p2}, Lp6/c;->c(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    if-eqz p2, :cond_9

    .line 185
    .line 186
    :goto_0
    :try_start_0
    iget-object p1, p1, Ld6/a;->e:Ld6/e;

    .line 187
    .line 188
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    iget-object p2, p0, Lh6/j;->e:Ld6/k;

    .line 192
    .line 193
    invoke-static {p2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p2}, Ld6/k;->a()Ljava/util/List;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    const-string v0, "hostname"

    .line 201
    .line 202
    invoke-static {v5, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    const-string v0, "peerCertificates"

    .line 206
    .line 207
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    new-instance v0, LC/k;

    .line 211
    .line 212
    const/4 v1, 0x7

    .line 213
    invoke-direct {v0, p1, p2, v5, v1}, LC/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p1, v5, v0}, Ld6/e;->a(Ljava/lang/String;LB5/a;)V
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 217
    .line 218
    .line 219
    return v6

    .line 220
    :catch_0
    :cond_9
    :goto_1
    return v3
.end method

.method public final i(Z)Z
    .locals 9

    .line 1
    sget-object v0, Le6/b;->a:[B

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lh6/j;->c:Ljava/net/Socket;

    .line 8
    .line 9
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v3, p0, Lh6/j;->d:Ljava/net/Socket;

    .line 13
    .line 14
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v4, p0, Lh6/j;->h:Lq6/A;

    .line 18
    .line 19
    invoke-static {v4}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/net/Socket;->isClosed()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v5, 0x0

    .line 27
    if-nez v2, :cond_5

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/net/Socket;->isClosed()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_5

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/net/Socket;->isInputShutdown()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_5

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/net/Socket;->isOutputShutdown()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    iget-object v2, p0, Lh6/j;->g:Lk6/n;

    .line 49
    .line 50
    const/4 v6, 0x1

    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    monitor-enter v2

    .line 54
    :try_start_0
    iget-boolean p1, v2, Lk6/n;->v:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    monitor-exit v2

    .line 59
    return v5

    .line 60
    :cond_1
    :try_start_1
    iget-wide v3, v2, Lk6/n;->D:J

    .line 61
    .line 62
    iget-wide v7, v2, Lk6/n;->C:J

    .line 63
    .line 64
    cmp-long p1, v3, v7

    .line 65
    .line 66
    if-gez p1, :cond_2

    .line 67
    .line 68
    iget-wide v3, v2, Lk6/n;->E:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    .line 70
    cmp-long p1, v0, v3

    .line 71
    .line 72
    if-ltz p1, :cond_2

    .line 73
    .line 74
    monitor-exit v2

    .line 75
    return v5

    .line 76
    :catchall_0
    move-exception p1

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    monitor-exit v2

    .line 79
    return v6

    .line 80
    :goto_0
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 81
    throw p1

    .line 82
    :cond_3
    monitor-enter p0

    .line 83
    :try_start_3
    iget-wide v7, p0, Lh6/j;->q:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 84
    .line 85
    sub-long/2addr v0, v7

    .line 86
    monitor-exit p0

    .line 87
    const-wide v7, 0x2540be400L

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    cmp-long v0, v0, v7

    .line 93
    .line 94
    if-ltz v0, :cond_4

    .line 95
    .line 96
    if-eqz p1, :cond_4

    .line 97
    .line 98
    :try_start_4
    invoke-virtual {v3}, Ljava/net/Socket;->getSoTimeout()I

    .line 99
    .line 100
    .line 101
    move-result p1
    :try_end_4
    .catch Ljava/net/SocketTimeoutException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 102
    :try_start_5
    invoke-virtual {v3, v6}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4}, Lq6/A;->a()Z

    .line 106
    .line 107
    .line 108
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 109
    xor-int/2addr v0, v6

    .line 110
    :try_start_6
    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 111
    .line 112
    .line 113
    return v0

    .line 114
    :catchall_1
    move-exception v0

    .line 115
    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 116
    .line 117
    .line 118
    throw v0
    :try_end_6
    .catch Ljava/net/SocketTimeoutException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    .line 119
    :catch_0
    move v5, v6

    .line 120
    :catch_1
    return v5

    .line 121
    :cond_4
    return v6

    .line 122
    :catchall_2
    move-exception p1

    .line 123
    monitor-exit p0

    .line 124
    throw p1

    .line 125
    :cond_5
    :goto_1
    return v5
.end method

.method public final j(Ld6/q;Li6/f;)Li6/d;
    .locals 6

    .line 1
    iget v0, p2, Li6/f;->g:I

    .line 2
    .line 3
    iget-object v1, p0, Lh6/j;->d:Ljava/net/Socket;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lh6/j;->h:Lq6/A;

    .line 9
    .line 10
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, Lh6/j;->i:Lq6/z;

    .line 14
    .line 15
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v4, p0, Lh6/j;->g:Lk6/n;

    .line 19
    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    new-instance v0, Lk6/o;

    .line 23
    .line 24
    invoke-direct {v0, p1, p0, p2, v4}, Lk6/o;-><init>(Ld6/q;Lh6/j;Li6/f;Lk6/n;)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    invoke-virtual {v1, v0}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 29
    .line 30
    .line 31
    iget-object v1, v2, Lq6/A;->q:Lq6/G;

    .line 32
    .line 33
    invoke-interface {v1}, Lq6/G;->d()Lq6/I;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    int-to-long v4, v0

    .line 38
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 39
    .line 40
    invoke-virtual {v1, v4, v5}, Lq6/I;->g(J)Lq6/I;

    .line 41
    .line 42
    .line 43
    iget-object v0, v3, Lq6/z;->q:Lq6/E;

    .line 44
    .line 45
    invoke-interface {v0}, Lq6/E;->d()Lq6/I;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget p2, p2, Li6/f;->h:I

    .line 50
    .line 51
    int-to-long v4, p2

    .line 52
    invoke-virtual {v0, v4, v5}, Lq6/I;->g(J)Lq6/I;

    .line 53
    .line 54
    .line 55
    new-instance p2, Lj6/f;

    .line 56
    .line 57
    invoke-direct {p2, p1, p0, v2, v3}, Lj6/f;-><init>(Ld6/q;Lh6/j;Lq6/A;Lq6/z;)V

    .line 58
    .line 59
    .line 60
    return-object p2
.end method

.method public final declared-synchronized k()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lh6/j;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    monitor-exit p0

    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception v0

    .line 8
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    throw v0
.end method

.method public final l()V
    .locals 10

    .line 1
    iget-object v0, p0, Lh6/j;->d:Ljava/net/Socket;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lh6/j;->h:Lq6/A;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lh6/j;->i:Lq6/z;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 18
    .line 19
    .line 20
    new-instance v4, Lp3/z0;

    .line 21
    .line 22
    sget-object v5, Lg6/d;->i:Lg6/d;

    .line 23
    .line 24
    const-string v6, "taskRunner"

    .line 25
    .line 26
    invoke-static {v5, v6}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v5, v4, Lp3/z0;->a:Ljava/lang/Object;

    .line 33
    .line 34
    sget-object v6, Lk6/h;->a:Lk6/g;

    .line 35
    .line 36
    iput-object v6, v4, Lp3/z0;->f:Ljava/lang/Object;

    .line 37
    .line 38
    iget-object v6, p0, Lh6/j;->b:Ld6/x;

    .line 39
    .line 40
    iget-object v6, v6, Ld6/x;->a:Ld6/a;

    .line 41
    .line 42
    iget-object v6, v6, Ld6/a;->h:Ld6/n;

    .line 43
    .line 44
    iget-object v6, v6, Ld6/n;->d:Ljava/lang/String;

    .line 45
    .line 46
    const-string v7, "peerName"

    .line 47
    .line 48
    invoke-static {v6, v7}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, v4, Lp3/z0;->b:Ljava/lang/Object;

    .line 52
    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    sget-object v7, Le6/b;->f:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const/16 v7, 0x20

    .line 64
    .line 65
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const-string v6, "<set-?>"

    .line 76
    .line 77
    invoke-static {v0, v6}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iput-object v0, v4, Lp3/z0;->c:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object v1, v4, Lp3/z0;->d:Ljava/lang/Object;

    .line 83
    .line 84
    iput-object v2, v4, Lp3/z0;->e:Ljava/lang/Object;

    .line 85
    .line 86
    iput-object p0, v4, Lp3/z0;->f:Ljava/lang/Object;

    .line 87
    .line 88
    new-instance v0, Lk6/n;

    .line 89
    .line 90
    invoke-direct {v0, v4}, Lk6/n;-><init>(Lp3/z0;)V

    .line 91
    .line 92
    .line 93
    iput-object v0, p0, Lh6/j;->g:Lk6/n;

    .line 94
    .line 95
    sget-object v1, Lk6/n;->P:Lk6/z;

    .line 96
    .line 97
    iget v2, v1, Lk6/z;->a:I

    .line 98
    .line 99
    and-int/lit8 v2, v2, 0x10

    .line 100
    .line 101
    const/4 v4, 0x4

    .line 102
    if-eqz v2, :cond_0

    .line 103
    .line 104
    iget-object v1, v1, Lk6/z;->b:[I

    .line 105
    .line 106
    aget v1, v1, v4

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_0
    const v1, 0x7fffffff

    .line 110
    .line 111
    .line 112
    :goto_0
    iput v1, p0, Lh6/j;->o:I

    .line 113
    .line 114
    iget-object v1, v0, Lk6/n;->M:Lk6/w;

    .line 115
    .line 116
    const-string v2, ">> CONNECTION "

    .line 117
    .line 118
    monitor-enter v1

    .line 119
    :try_start_0
    iget-boolean v6, v1, Lk6/w;->t:Z

    .line 120
    .line 121
    if-nez v6, :cond_9

    .line 122
    .line 123
    sget-object v6, Lk6/w;->v:Ljava/util/logging/Logger;

    .line 124
    .line 125
    sget-object v7, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 126
    .line 127
    invoke-virtual {v6, v7}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    if-eqz v7, :cond_1

    .line 132
    .line 133
    new-instance v7, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    sget-object v2, Lk6/f;->a:Lq6/j;

    .line 139
    .line 140
    invoke-virtual {v2}, Lq6/j;->d()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    new-array v7, v3, [Ljava/lang/Object;

    .line 152
    .line 153
    invoke-static {v2, v7}, Le6/b;->f(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v6, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :catchall_0
    move-exception v0

    .line 162
    goto/16 :goto_7

    .line 163
    .line 164
    :cond_1
    :goto_1
    iget-object v2, v1, Lk6/w;->q:Lq6/h;

    .line 165
    .line 166
    sget-object v6, Lk6/f;->a:Lq6/j;

    .line 167
    .line 168
    invoke-interface {v2, v6}, Lq6/h;->i(Lq6/j;)Lq6/h;

    .line 169
    .line 170
    .line 171
    iget-object v2, v1, Lk6/w;->q:Lq6/h;

    .line 172
    .line 173
    invoke-interface {v2}, Lq6/h;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 174
    .line 175
    .line 176
    monitor-exit v1

    .line 177
    iget-object v2, v0, Lk6/n;->M:Lk6/w;

    .line 178
    .line 179
    iget-object v1, v0, Lk6/n;->F:Lk6/z;

    .line 180
    .line 181
    monitor-enter v2

    .line 182
    :try_start_1
    const-string v6, "settings"

    .line 183
    .line 184
    invoke-static {v1, v6}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    iget-boolean v6, v2, Lk6/w;->t:Z

    .line 188
    .line 189
    if-nez v6, :cond_8

    .line 190
    .line 191
    iget v6, v1, Lk6/z;->a:I

    .line 192
    .line 193
    invoke-static {v6}, Ljava/lang/Integer;->bitCount(I)I

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    mul-int/lit8 v6, v6, 0x6

    .line 198
    .line 199
    invoke-virtual {v2, v3, v6, v4, v3}, Lk6/w;->c(IIII)V

    .line 200
    .line 201
    .line 202
    move v6, v3

    .line 203
    :goto_2
    const/16 v7, 0xa

    .line 204
    .line 205
    if-ge v6, v7, :cond_6

    .line 206
    .line 207
    const/4 v7, 0x1

    .line 208
    shl-int v8, v7, v6

    .line 209
    .line 210
    iget v9, v1, Lk6/z;->a:I

    .line 211
    .line 212
    and-int/2addr v8, v9

    .line 213
    if-eqz v8, :cond_2

    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_2
    move v7, v3

    .line 217
    :goto_3
    if-eqz v7, :cond_5

    .line 218
    .line 219
    if-eq v6, v4, :cond_4

    .line 220
    .line 221
    const/4 v7, 0x7

    .line 222
    if-eq v6, v7, :cond_3

    .line 223
    .line 224
    move v7, v6

    .line 225
    goto :goto_4

    .line 226
    :cond_3
    move v7, v4

    .line 227
    goto :goto_4

    .line 228
    :cond_4
    const/4 v7, 0x3

    .line 229
    :goto_4
    iget-object v8, v2, Lk6/w;->q:Lq6/h;

    .line 230
    .line 231
    invoke-interface {v8, v7}, Lq6/h;->writeShort(I)Lq6/h;

    .line 232
    .line 233
    .line 234
    iget-object v7, v2, Lk6/w;->q:Lq6/h;

    .line 235
    .line 236
    iget-object v8, v1, Lk6/z;->b:[I

    .line 237
    .line 238
    aget v8, v8, v6

    .line 239
    .line 240
    invoke-interface {v7, v8}, Lq6/h;->writeInt(I)Lq6/h;

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :catchall_1
    move-exception v0

    .line 245
    goto :goto_6

    .line 246
    :cond_5
    :goto_5
    add-int/lit8 v6, v6, 0x1

    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_6
    iget-object v1, v2, Lk6/w;->q:Lq6/h;

    .line 250
    .line 251
    invoke-interface {v1}, Lq6/h;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 252
    .line 253
    .line 254
    monitor-exit v2

    .line 255
    iget-object v1, v0, Lk6/n;->F:Lk6/z;

    .line 256
    .line 257
    invoke-virtual {v1}, Lk6/z;->a()I

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    const v2, 0xffff

    .line 262
    .line 263
    .line 264
    if-eq v1, v2, :cond_7

    .line 265
    .line 266
    iget-object v4, v0, Lk6/n;->M:Lk6/w;

    .line 267
    .line 268
    sub-int/2addr v1, v2

    .line 269
    int-to-long v1, v1

    .line 270
    invoke-virtual {v4, v3, v1, v2}, Lk6/w;->z(IJ)V

    .line 271
    .line 272
    .line 273
    :cond_7
    invoke-virtual {v5}, Lg6/d;->e()Lg6/c;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    iget-object v2, v0, Lk6/n;->s:Ljava/lang/String;

    .line 278
    .line 279
    iget-object v0, v0, Lk6/n;->N:La5/v;

    .line 280
    .line 281
    new-instance v3, Lg6/b;

    .line 282
    .line 283
    const/4 v4, 0x0

    .line 284
    invoke-direct {v3, v2, v0, v4}, Lg6/b;-><init>(Ljava/lang/String;Ljava/lang/Object;I)V

    .line 285
    .line 286
    .line 287
    const-wide/16 v4, 0x0

    .line 288
    .line 289
    invoke-virtual {v1, v3, v4, v5}, Lg6/c;->c(Lg6/a;J)V

    .line 290
    .line 291
    .line 292
    return-void

    .line 293
    :cond_8
    :try_start_2
    new-instance v0, Ljava/io/IOException;

    .line 294
    .line 295
    const-string v1, "closed"

    .line 296
    .line 297
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    throw v0

    .line 301
    :goto_6
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 302
    throw v0

    .line 303
    :cond_9
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    .line 304
    .line 305
    const-string v2, "closed"

    .line 306
    .line 307
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    throw v0

    .line 311
    :goto_7
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 312
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Connection{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lh6/j;->b:Ld6/x;

    .line 9
    .line 10
    iget-object v2, v1, Ld6/x;->a:Ld6/a;

    .line 11
    .line 12
    iget-object v2, v2, Ld6/a;->h:Ld6/n;

    .line 13
    .line 14
    iget-object v2, v2, Ld6/n;->d:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const/16 v2, 0x3a

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v2, v1, Ld6/x;->a:Ld6/a;

    .line 25
    .line 26
    iget-object v2, v2, Ld6/a;->h:Ld6/n;

    .line 27
    .line 28
    iget v2, v2, Ld6/n;->e:I

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v2, ", proxy="

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v2, v1, Ld6/x;->b:Ljava/net/Proxy;

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v2, " hostAddress="

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, v1, Ld6/x;->c:Ljava/net/InetSocketAddress;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, " cipherSuite="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lh6/j;->e:Ld6/k;

    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    iget-object v1, v1, Ld6/k;->b:Ld6/g;

    .line 63
    .line 64
    if-nez v1, :cond_1

    .line 65
    .line 66
    :cond_0
    const-string v1, "none"

    .line 67
    .line 68
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, " protocol="

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, Lh6/j;->f:Ld6/r;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const/16 v1, 0x7d

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    return-object v0
.end method
