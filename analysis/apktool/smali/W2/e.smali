.class public final LW2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/n;


# instance fields
.field public final a:LB0/G0;

.field public final b:LZ/m;

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(LB0/G0;LZ/m;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LW2/e;->a:LB0/G0;

    .line 5
    .line 6
    iput-object p2, p0, LW2/e;->b:LZ/m;

    .line 7
    .line 8
    iput p3, p0, LW2/e;->c:I

    .line 9
    .line 10
    iput p4, p0, LW2/e;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, LW2/e;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, LW2/e;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()J
    .locals 2

    .line 1
    const-wide/16 v0, 0x800

    .line 2
    .line 3
    return-wide v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final e(Landroid/graphics/Canvas;)V
    .locals 10

    .line 1
    iget-object v0, p0, LW2/e;->a:LB0/G0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LW2/e;->b:LZ/m;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    new-instance v1, LZ/m;

    .line 11
    .line 12
    const/16 v2, 0x16

    .line 13
    .line 14
    invoke-direct {v1, v2}, LZ/m;-><init>(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v2, v1, LZ/m;->s:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Li0/a;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    int-to-float v2, v2

    .line 29
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    int-to-float v3, v3

    .line 34
    new-instance v4, Li0/a;

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    invoke-direct {v4, v5, v5, v2, v3}, Li0/a;-><init>(FFFF)V

    .line 38
    .line 39
    .line 40
    iput-object v4, v1, LZ/m;->s:Ljava/lang/Object;

    .line 41
    .line 42
    :goto_0
    new-instance v2, Lp3/z0;

    .line 43
    .line 44
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, v2, Lp3/z0;->a:Ljava/lang/Object;

    .line 48
    .line 49
    iput-object v0, v2, Lp3/z0;->b:Ljava/lang/Object;

    .line 50
    .line 51
    iget-object p1, v0, LB0/G0;->r:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Lp3/T;

    .line 54
    .line 55
    if-nez p1, :cond_2

    .line 56
    .line 57
    const-string p1, "SVGAndroidRenderer"

    .line 58
    .line 59
    const-string v0, "Nothing to render. Document is empty."

    .line 60
    .line 61
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    iget-object v3, p1, Lp3/e0;->o:Li0/a;

    .line 66
    .line 67
    iget-object v4, p1, Lp3/c0;->n:Lp3/q;

    .line 68
    .line 69
    iget-object v5, v1, LZ/m;->r:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v5, LF3/c;

    .line 72
    .line 73
    const/4 v6, 0x1

    .line 74
    const/4 v7, 0x0

    .line 75
    if-eqz v5, :cond_4

    .line 76
    .line 77
    iget-object v5, v5, LF3/c;->r:Ljava/util/ArrayList;

    .line 78
    .line 79
    if-eqz v5, :cond_3

    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    goto :goto_1

    .line 86
    :cond_3
    move v5, v7

    .line 87
    :goto_1
    if-lez v5, :cond_4

    .line 88
    .line 89
    move v5, v6

    .line 90
    goto :goto_2

    .line 91
    :cond_4
    move v5, v7

    .line 92
    :goto_2
    if-eqz v5, :cond_5

    .line 93
    .line 94
    iget-object v5, v1, LZ/m;->r:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v5, LF3/c;

    .line 97
    .line 98
    iget-object v8, v0, LB0/G0;->s:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v8, LF3/c;

    .line 101
    .line 102
    invoke-virtual {v8, v5}, LF3/c;->b(LF3/c;)V

    .line 103
    .line 104
    .line 105
    :cond_5
    new-instance v5, Lp3/x0;

    .line 106
    .line 107
    invoke-direct {v5}, Lp3/x0;-><init>()V

    .line 108
    .line 109
    .line 110
    iput-object v5, v2, Lp3/z0;->c:Ljava/lang/Object;

    .line 111
    .line 112
    new-instance v5, Ljava/util/Stack;

    .line 113
    .line 114
    invoke-direct {v5}, Ljava/util/Stack;-><init>()V

    .line 115
    .line 116
    .line 117
    iput-object v5, v2, Lp3/z0;->d:Ljava/lang/Object;

    .line 118
    .line 119
    iget-object v5, v2, Lp3/z0;->c:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v5, Lp3/x0;

    .line 122
    .line 123
    invoke-static {}, Lp3/S;->a()Lp3/S;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    invoke-virtual {v2, v5, v8}, Lp3/z0;->c0(Lp3/x0;Lp3/S;)V

    .line 128
    .line 129
    .line 130
    iget-object v5, v2, Lp3/z0;->c:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v5, Lp3/x0;

    .line 133
    .line 134
    const/4 v8, 0x0

    .line 135
    iput-object v8, v5, Lp3/x0;->f:Li0/a;

    .line 136
    .line 137
    iput-boolean v7, v5, Lp3/x0;->h:Z

    .line 138
    .line 139
    iget-object v8, v2, Lp3/z0;->d:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v8, Ljava/util/Stack;

    .line 142
    .line 143
    new-instance v9, Lp3/x0;

    .line 144
    .line 145
    invoke-direct {v9, v5}, Lp3/x0;-><init>(Lp3/x0;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v8, v9}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    new-instance v5, Ljava/util/Stack;

    .line 152
    .line 153
    invoke-direct {v5}, Ljava/util/Stack;-><init>()V

    .line 154
    .line 155
    .line 156
    iput-object v5, v2, Lp3/z0;->f:Ljava/lang/Object;

    .line 157
    .line 158
    new-instance v5, Ljava/util/Stack;

    .line 159
    .line 160
    invoke-direct {v5}, Ljava/util/Stack;-><init>()V

    .line 161
    .line 162
    .line 163
    iput-object v5, v2, Lp3/z0;->e:Ljava/lang/Object;

    .line 164
    .line 165
    iget-object v5, p1, Lp3/Y;->d:Ljava/lang/Boolean;

    .line 166
    .line 167
    if-eqz v5, :cond_6

    .line 168
    .line 169
    iget-object v8, v2, Lp3/z0;->c:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v8, Lp3/x0;

    .line 172
    .line 173
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    iput-boolean v5, v8, Lp3/x0;->h:Z

    .line 178
    .line 179
    :cond_6
    invoke-virtual {v2}, Lp3/z0;->Z()V

    .line 180
    .line 181
    .line 182
    new-instance v5, Li0/a;

    .line 183
    .line 184
    iget-object v8, v1, LZ/m;->s:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v8, Li0/a;

    .line 187
    .line 188
    invoke-direct {v5, v8}, Li0/a;-><init>(Li0/a;)V

    .line 189
    .line 190
    .line 191
    iget-object v8, p1, Lp3/T;->r:Lp3/C;

    .line 192
    .line 193
    if-eqz v8, :cond_7

    .line 194
    .line 195
    iget v9, v5, Li0/a;->d:F

    .line 196
    .line 197
    invoke-virtual {v8, v2, v9}, Lp3/C;->b(Lp3/z0;F)F

    .line 198
    .line 199
    .line 200
    move-result v8

    .line 201
    iput v8, v5, Li0/a;->d:F

    .line 202
    .line 203
    :cond_7
    iget-object v8, p1, Lp3/T;->s:Lp3/C;

    .line 204
    .line 205
    if-eqz v8, :cond_8

    .line 206
    .line 207
    iget v9, v5, Li0/a;->e:F

    .line 208
    .line 209
    invoke-virtual {v8, v2, v9}, Lp3/C;->b(Lp3/z0;F)F

    .line 210
    .line 211
    .line 212
    move-result v8

    .line 213
    iput v8, v5, Li0/a;->e:F

    .line 214
    .line 215
    :cond_8
    invoke-virtual {v2, p1, v5, v3, v4}, Lp3/z0;->P(Lp3/T;Li0/a;Li0/a;Lp3/q;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2}, Lp3/z0;->Y()V

    .line 219
    .line 220
    .line 221
    iget-object p1, v1, LZ/m;->r:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast p1, LF3/c;

    .line 224
    .line 225
    if-eqz p1, :cond_a

    .line 226
    .line 227
    iget-object p1, p1, LF3/c;->r:Ljava/util/ArrayList;

    .line 228
    .line 229
    if-eqz p1, :cond_9

    .line 230
    .line 231
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    goto :goto_3

    .line 236
    :cond_9
    move p1, v7

    .line 237
    :goto_3
    if-lez p1, :cond_a

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_a
    move v6, v7

    .line 241
    :goto_4
    if-eqz v6, :cond_d

    .line 242
    .line 243
    iget-object p1, v0, LB0/G0;->s:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast p1, LF3/c;

    .line 246
    .line 247
    iget-object p1, p1, LF3/c;->r:Ljava/util/ArrayList;

    .line 248
    .line 249
    if-nez p1, :cond_b

    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_b
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    :cond_c
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-eqz v0, :cond_d

    .line 261
    .line 262
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    check-cast v0, Lp3/l;

    .line 267
    .line 268
    iget v0, v0, Lp3/l;->c:I

    .line 269
    .line 270
    const/4 v1, 0x2

    .line 271
    if-ne v0, v1, :cond_c

    .line 272
    .line 273
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    .line 274
    .line 275
    .line 276
    goto :goto_5

    .line 277
    :cond_d
    :goto_6
    return-void
.end method
