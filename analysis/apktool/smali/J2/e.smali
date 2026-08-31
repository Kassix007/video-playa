.class public final LJ2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ2/k;


# instance fields
.field public final synthetic a:I

.field public final b:LU2/n;

.field public final c:LU5/i;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LJ2/q;LU2/n;LU5/i;LJ2/n;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LJ2/e;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LJ2/e;->d:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, LJ2/e;->b:LU2/n;

    .line 4
    iput-object p3, p0, LJ2/e;->c:LU5/i;

    .line 5
    iput-object p4, p0, LJ2/e;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/ImageDecoder$Source;Ljava/lang/AutoCloseable;LU2/n;LU5/i;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LJ2/e;->a:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, LJ2/e;->d:Ljava/lang/Object;

    .line 8
    iput-object p2, p0, LJ2/e;->e:Ljava/lang/Object;

    .line 9
    iput-object p3, p0, LJ2/e;->b:LU2/n;

    .line 10
    iput-object p4, p0, LJ2/e;->c:LU5/i;

    return-void
.end method


# virtual methods
.method public final a(Lq5/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, LJ2/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, LJ2/v;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, LJ2/v;

    .line 12
    .line 13
    iget v1, v0, LJ2/v;->t:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    and-int v3, v1, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, v0, LJ2/v;->t:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, LJ2/v;

    .line 26
    .line 27
    check-cast p1, Ls5/c;

    .line 28
    .line 29
    invoke-direct {v0, p0, p1}, LJ2/v;-><init>(LJ2/e;Ls5/c;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    iget-object p1, v0, LJ2/v;->r:Ljava/lang/Object;

    .line 33
    .line 34
    iget v1, v0, LJ2/v;->t:I

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    if-ne v1, v2, :cond_1

    .line 40
    .line 41
    iget-object v0, v0, LJ2/v;->q:LU5/i;

    .line 42
    .line 43
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, LJ2/e;->c:LU5/i;

    .line 59
    .line 60
    iput-object p1, v0, LJ2/v;->q:LU5/i;

    .line 61
    .line 62
    iput v2, v0, LJ2/v;->t:I

    .line 63
    .line 64
    invoke-virtual {p1, v0}, LU5/h;->a(Ls5/c;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sget-object v1, Lr5/a;->q:Lr5/a;

    .line 69
    .line 70
    if-ne v0, v1, :cond_3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    move-object v0, p1

    .line 74
    :goto_1
    :try_start_0
    iget-object p1, p0, LJ2/e;->e:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, Ljava/lang/AutoCloseable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    :try_start_1
    new-instance v1, Lkotlin/jvm/internal/u;

    .line 79
    .line 80
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 81
    .line 82
    .line 83
    iget-object v2, p0, LJ2/e;->d:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v2, Landroid/graphics/ImageDecoder$Source;

    .line 86
    .line 87
    new-instance v3, LJ2/w;

    .line 88
    .line 89
    invoke-direct {v3, p0, v1}, LJ2/w;-><init>(LJ2/e;Lkotlin/jvm/internal/u;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v2, v3}, LB3/c;->b(Landroid/graphics/ImageDecoder$Source;Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;)Landroid/graphics/Bitmap;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    new-instance v3, LJ2/i;

    .line 97
    .line 98
    new-instance v4, LI2/a;

    .line 99
    .line 100
    invoke-direct {v4, v2}, LI2/a;-><init>(Landroid/graphics/Bitmap;)V

    .line 101
    .line 102
    .line 103
    iget-boolean v1, v1, Lkotlin/jvm/internal/u;->q:Z

    .line 104
    .line 105
    invoke-direct {v3, v4, v1}, LJ2/i;-><init>(LI2/n;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 106
    .line 107
    .line 108
    const/4 v1, 0x0

    .line 109
    :try_start_2
    invoke-static {p1, v1}, Ln5/A;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, LU5/h;->c()V

    .line 113
    .line 114
    .line 115
    move-object v1, v3

    .line 116
    :goto_2
    return-object v1

    .line 117
    :catchall_0
    move-exception p1

    .line 118
    goto :goto_3

    .line 119
    :catchall_1
    move-exception v1

    .line 120
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 121
    :catchall_2
    move-exception v2

    .line 122
    :try_start_4
    invoke-static {p1, v1}, Ln5/A;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 126
    :goto_3
    invoke-virtual {v0}, LU5/h;->c()V

    .line 127
    .line 128
    .line 129
    throw p1

    .line 130
    :pswitch_0
    instance-of v0, p1, LJ2/d;

    .line 131
    .line 132
    if-eqz v0, :cond_4

    .line 133
    .line 134
    move-object v0, p1

    .line 135
    check-cast v0, LJ2/d;

    .line 136
    .line 137
    iget v1, v0, LJ2/d;->t:I

    .line 138
    .line 139
    const/high16 v2, -0x80000000

    .line 140
    .line 141
    and-int v3, v1, v2

    .line 142
    .line 143
    if-eqz v3, :cond_4

    .line 144
    .line 145
    sub-int/2addr v1, v2

    .line 146
    iput v1, v0, LJ2/d;->t:I

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_4
    new-instance v0, LJ2/d;

    .line 150
    .line 151
    check-cast p1, Ls5/c;

    .line 152
    .line 153
    invoke-direct {v0, p0, p1}, LJ2/d;-><init>(LJ2/e;Ls5/c;)V

    .line 154
    .line 155
    .line 156
    :goto_4
    iget-object p1, v0, LJ2/d;->r:Ljava/lang/Object;

    .line 157
    .line 158
    iget v1, v0, LJ2/d;->t:I

    .line 159
    .line 160
    const/4 v2, 0x2

    .line 161
    const/4 v3, 0x1

    .line 162
    sget-object v4, Lr5/a;->q:Lr5/a;

    .line 163
    .line 164
    if-eqz v1, :cond_7

    .line 165
    .line 166
    if-eq v1, v3, :cond_6

    .line 167
    .line 168
    if-ne v1, v2, :cond_5

    .line 169
    .line 170
    iget-object v0, v0, LJ2/d;->q:LU5/e;

    .line 171
    .line 172
    :try_start_5
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 173
    .line 174
    .line 175
    goto :goto_6

    .line 176
    :catchall_3
    move-exception p1

    .line 177
    goto :goto_9

    .line 178
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 179
    .line 180
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 181
    .line 182
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw p1

    .line 186
    :cond_6
    iget-object v1, v0, LJ2/d;->q:LU5/e;

    .line 187
    .line 188
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    move-object p1, v1

    .line 192
    goto :goto_5

    .line 193
    :cond_7
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    iget-object p1, p0, LJ2/e;->c:LU5/i;

    .line 197
    .line 198
    iput-object p1, v0, LJ2/d;->q:LU5/e;

    .line 199
    .line 200
    iput v3, v0, LJ2/d;->t:I

    .line 201
    .line 202
    invoke-virtual {p1, v0}, LU5/h;->a(Ls5/c;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    if-ne v1, v4, :cond_8

    .line 207
    .line 208
    goto :goto_7

    .line 209
    :cond_8
    :goto_5
    :try_start_6
    new-instance v1, LI2/d;

    .line 210
    .line 211
    const/4 v3, 0x3

    .line 212
    invoke-direct {v1, v3, p0}, LI2/d;-><init>(ILjava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    iput-object p1, v0, LJ2/d;->q:LU5/e;

    .line 216
    .line 217
    iput v2, v0, LJ2/d;->t:I

    .line 218
    .line 219
    sget-object v2, Lq5/i;->q:Lq5/i;

    .line 220
    .line 221
    new-instance v3, LM5/Z;

    .line 222
    .line 223
    const/4 v5, 0x0

    .line 224
    invoke-direct {v3, v1, v5}, LM5/Z;-><init>(LB5/a;Lq5/c;)V

    .line 225
    .line 226
    .line 227
    invoke-static {v2, v3, v0}, LM5/y;->B(Lq5/h;LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 231
    if-ne v0, v4, :cond_9

    .line 232
    .line 233
    goto :goto_7

    .line 234
    :cond_9
    move-object v6, v0

    .line 235
    move-object v0, p1

    .line 236
    move-object p1, v6

    .line 237
    :goto_6
    :try_start_7
    move-object v4, p1

    .line 238
    check-cast v4, LJ2/i;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 239
    .line 240
    check-cast v0, LU5/h;

    .line 241
    .line 242
    invoke-virtual {v0}, LU5/h;->c()V

    .line 243
    .line 244
    .line 245
    :goto_7
    return-object v4

    .line 246
    :goto_8
    move-object v6, v0

    .line 247
    move-object v0, p1

    .line 248
    move-object p1, v6

    .line 249
    goto :goto_9

    .line 250
    :catchall_4
    move-exception v0

    .line 251
    goto :goto_8

    .line 252
    :goto_9
    check-cast v0, LU5/h;

    .line 253
    .line 254
    invoke-virtual {v0}, LU5/h;->c()V

    .line 255
    .line 256
    .line 257
    throw p1

    .line 258
    nop

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
