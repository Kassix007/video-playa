.class public final synthetic LZ4/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# instance fields
.field public final synthetic a:LW0/c;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:J

.field public final synthetic f:Landroid/widget/VideoView;

.field public final synthetic g:LB5/c;


# direct methods
.method public synthetic constructor <init>(LW0/c;Ljava/lang/String;FFJLandroid/widget/VideoView;LB5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ4/B;->a:LW0/c;

    iput-object p2, p0, LZ4/B;->b:Ljava/lang/String;

    iput p3, p0, LZ4/B;->c:F

    iput p4, p0, LZ4/B;->d:F

    iput-wide p5, p0, LZ4/B;->e:J

    iput-object p7, p0, LZ4/B;->f:Landroid/widget/VideoView;

    iput-object p8, p0, LZ4/B;->g:LB5/c;

    return-void
.end method


# virtual methods
.method public final onPrepared(Landroid/media/MediaPlayer;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, LZ4/B;->a:LW0/c;

    .line 6
    .line 7
    invoke-interface {v1, v0}, LW0/c;->f0(I)F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoHeight()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-interface {v1, p1}, LW0/c;->f0(I)F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iget-object v1, p0, LZ4/B;->b:Ljava/lang/String;

    .line 20
    .line 21
    const-string v2, "SMALL"

    .line 22
    .line 23
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    iget v4, p0, LZ4/B;->c:F

    .line 28
    .line 29
    const/4 v5, 0x2

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    move v3, v4

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    int-to-float v3, v5

    .line 35
    mul-float/2addr v3, v4

    .line 36
    :goto_0
    invoke-static {v0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    const-string v7, "FULL_SCREEN"

    .line 41
    .line 42
    const-string v8, "FULL_WIDTH"

    .line 43
    .line 44
    if-ltz v6, :cond_2

    .line 45
    .line 46
    invoke-static {v0, v3}, Ljava/lang/Float;->compare(FF)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    const-string v4, "width"

    .line 51
    .line 52
    if-lez v2, :cond_1

    .line 53
    .line 54
    invoke-static {v0, p1, v3, v4}, Ll6/d;->m(FFFLjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_1
    invoke-static {v0, v3}, Ljava/lang/Float;->compare(FF)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-gez v2, :cond_7

    .line 63
    .line 64
    invoke-static {v0, p1, v3, v4, v3}, Ll6/d;->t(FFFLjava/lang/String;F)V

    .line 65
    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_2
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    iget v3, p0, LZ4/B;->d:F

    .line 73
    .line 74
    if-eqz v2, :cond_3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    invoke-static {v1, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_4

    .line 82
    .line 83
    :goto_1
    move v2, v3

    .line 84
    goto :goto_2

    .line 85
    :cond_4
    int-to-float v2, v5

    .line 86
    mul-float/2addr v2, v3

    .line 87
    :goto_2
    invoke-static {p1, v2}, Ljava/lang/Float;->compare(FF)I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    const-string v6, "height"

    .line 92
    .line 93
    if-lez v5, :cond_5

    .line 94
    .line 95
    invoke-static {v0, p1, v2, v6}, Ll6/d;->m(FFFLjava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_5
    invoke-static {v1, v7}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-eqz v5, :cond_6

    .line 104
    .line 105
    invoke-static {p1, v2}, Ljava/lang/Float;->compare(FF)I

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-gez v5, :cond_6

    .line 110
    .line 111
    invoke-static {v0, p1, v2, v6, v4}, Ll6/d;->t(FFFLjava/lang/String;F)V

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_6
    sput v4, LZ4/L;->a:F

    .line 116
    .line 117
    sput v3, LZ4/L;->b:F

    .line 118
    .line 119
    :cond_7
    :goto_3
    invoke-static {v1, v7}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    sget-object v3, Lj0/B;->a:LO3/D;

    .line 124
    .line 125
    sget-object v4, Lc0/j;->q:Lc0/j;

    .line 126
    .line 127
    iget-wide v5, p0, LZ4/B;->e:J

    .line 128
    .line 129
    if-eqz v2, :cond_8

    .line 130
    .line 131
    sget p1, LZ4/L;->b:F

    .line 132
    .line 133
    invoke-static {v4, p1}, Landroidx/compose/foundation/layout/c;->a(Lc0/m;F)Lc0/m;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    sget v0, LZ4/L;->a:F

    .line 138
    .line 139
    invoke-static {p1, v0}, Landroidx/compose/foundation/layout/c;->e(Lc0/m;F)Lc0/m;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-static {p1, v5, v6, v3}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    goto/16 :goto_4

    .line 148
    .line 149
    :cond_8
    invoke-static {v1, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_a

    .line 154
    .line 155
    invoke-static {v0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    const/4 v0, 0x5

    .line 160
    if-gez p1, :cond_9

    .line 161
    .line 162
    sget p1, LZ4/L;->b:F

    .line 163
    .line 164
    invoke-static {v4, p1}, Landroidx/compose/foundation/layout/c;->a(Lc0/m;F)Lc0/m;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    sget v1, LZ4/L;->a:F

    .line 169
    .line 170
    invoke-static {p1, v1}, Landroidx/compose/foundation/layout/c;->e(Lc0/m;F)Lc0/m;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-static {v0}, LH/e;->a(I)LH/d;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {p1, v0}, La/a;->n(Lc0/m;Lj0/E;)Lc0/m;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-static {p1, v5, v6, v3}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    goto :goto_4

    .line 187
    :cond_9
    sget p1, LZ4/L;->b:F

    .line 188
    .line 189
    invoke-static {v4, p1}, Landroidx/compose/foundation/layout/c;->a(Lc0/m;F)Lc0/m;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    sget v1, LZ4/L;->a:F

    .line 194
    .line 195
    invoke-static {p1, v1}, Landroidx/compose/foundation/layout/c;->e(Lc0/m;F)Lc0/m;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-static {v0}, LH/e;->a(I)LH/d;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-static {p1, v0}, La/a;->n(Lc0/m;Lj0/E;)Lc0/m;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-static {p1, v5, v6, v3}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    goto :goto_4

    .line 212
    :cond_a
    invoke-static {p1, v0}, Ljava/lang/Float;->compare(FF)I

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    const/16 v0, 0xa

    .line 217
    .line 218
    if-lez p1, :cond_b

    .line 219
    .line 220
    sget p1, LZ4/L;->b:F

    .line 221
    .line 222
    invoke-static {v4, p1}, Landroidx/compose/foundation/layout/c;->a(Lc0/m;F)Lc0/m;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    sget v1, LZ4/L;->a:F

    .line 227
    .line 228
    invoke-static {p1, v1}, Landroidx/compose/foundation/layout/c;->e(Lc0/m;F)Lc0/m;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-static {v0}, LH/e;->a(I)LH/d;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-static {p1, v0}, La/a;->n(Lc0/m;Lj0/E;)Lc0/m;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-static {p1, v5, v6, v3}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    goto :goto_4

    .line 245
    :cond_b
    sget p1, LZ4/L;->b:F

    .line 246
    .line 247
    invoke-static {v4, p1}, Landroidx/compose/foundation/layout/c;->a(Lc0/m;F)Lc0/m;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    sget v1, LZ4/L;->a:F

    .line 252
    .line 253
    invoke-static {p1, v1}, Landroidx/compose/foundation/layout/c;->e(Lc0/m;F)Lc0/m;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    invoke-static {v0}, LH/e;->a(I)LH/d;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-static {p1, v0}, La/a;->n(Lc0/m;Lj0/E;)Lc0/m;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    invoke-static {p1, v5, v6, v3}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    :goto_4
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 270
    .line 271
    const/4 v1, -0x1

    .line 272
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 273
    .line 274
    .line 275
    iget-object v1, p0, LZ4/B;->f:Landroid/widget/VideoView;

    .line 276
    .line 277
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 278
    .line 279
    .line 280
    iget-object v0, p0, LZ4/B;->g:LB5/c;

    .line 281
    .line 282
    invoke-interface {v0, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1}, Landroid/widget/VideoView;->start()V

    .line 286
    .line 287
    .line 288
    return-void
.end method
