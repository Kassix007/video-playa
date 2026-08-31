.class public final Lv/u;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lv/u;->q:I

    iput-object p2, p0, Lv/u;->r:Ljava/lang/Object;

    iput-object p3, p0, Lv/u;->s:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lv/u;->q:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lm5/y;->a:Lm5/y;

    .line 5
    .line 6
    iget-object v3, p0, Lv/u;->s:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, Lv/u;->r:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 16
    .line 17
    .line 18
    check-cast v4, Lw/j1;

    .line 19
    .line 20
    iget p1, v4, Lw/j1;->e:F

    .line 21
    .line 22
    iput v1, v4, Lw/j1;->e:F

    .line 23
    .line 24
    check-cast v3, LB5/c;

    .line 25
    .line 26
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {v3, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-object v2

    .line 34
    :pswitch_0
    check-cast p1, Lw/p;

    .line 35
    .line 36
    check-cast v4, Lw/E0;

    .line 37
    .line 38
    check-cast v3, Lw/H0;

    .line 39
    .line 40
    iget-wide v0, p1, Lw/p;->a:J

    .line 41
    .line 42
    iget-object p1, v3, Lw/H0;->d:Lw/d0;

    .line 43
    .line 44
    sget-object v3, Lw/d0;->r:Lw/d0;

    .line 45
    .line 46
    const/4 v5, 0x1

    .line 47
    if-ne p1, v3, :cond_0

    .line 48
    .line 49
    invoke-static {v5, v0, v1}, Li0/b;->a(IJ)J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const/4 p1, 0x2

    .line 55
    invoke-static {p1, v0, v1}, Li0/b;->a(IJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    :goto_0
    invoke-virtual {v4, v5, v0, v1}, Lw/E0;->a(IJ)J

    .line 60
    .line 61
    .line 62
    return-object v2

    .line 63
    :pswitch_1
    check-cast p1, Lw/p;

    .line 64
    .line 65
    check-cast v4, LN/q;

    .line 66
    .line 67
    check-cast v3, Lw/H;

    .line 68
    .line 69
    iget-wide v5, p1, Lw/p;->a:J

    .line 70
    .line 71
    const/high16 p1, 0x3f800000    # 1.0f

    .line 72
    .line 73
    invoke-static {v5, v6, p1}, Li0/b;->f(JF)J

    .line 74
    .line 75
    .line 76
    move-result-wide v5

    .line 77
    iget-object p1, v3, Lw/H;->P:Lw/d0;

    .line 78
    .line 79
    sget-object v0, Lw/D;->a:Le3/u;

    .line 80
    .line 81
    sget-object v0, Lw/d0;->q:Lw/d0;

    .line 82
    .line 83
    if-ne p1, v0, :cond_1

    .line 84
    .line 85
    const-wide v7, 0xffffffffL

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    and-long/2addr v5, v7

    .line 91
    :goto_1
    long-to-int p1, v5

    .line 92
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    goto :goto_2

    .line 97
    :cond_1
    const/16 p1, 0x20

    .line 98
    .line 99
    shr-long/2addr v5, p1

    .line 100
    goto :goto_1

    .line 101
    :goto_2
    iget-object v0, v4, LN/q;->a:LN/r;

    .line 102
    .line 103
    iget-object v3, v0, LN/r;->n:LN/o;

    .line 104
    .line 105
    invoke-virtual {v0, p1}, LN/r;->e(F)F

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    iget-object v0, v3, LN/o;->a:LN/r;

    .line 110
    .line 111
    iget-object v3, v0, LN/r;->j:LP/b0;

    .line 112
    .line 113
    invoke-virtual {v3, p1}, LP/b0;->f(F)V

    .line 114
    .line 115
    .line 116
    iget-object p1, v0, LN/r;->k:LP/b0;

    .line 117
    .line 118
    invoke-virtual {p1, v1}, LP/b0;->f(F)V

    .line 119
    .line 120
    .line 121
    return-object v2

    .line 122
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 123
    .line 124
    check-cast v4, LE/k;

    .line 125
    .line 126
    iget-object p1, v4, LE/k;->a:LR/e;

    .line 127
    .line 128
    check-cast v3, Lw/g;

    .line 129
    .line 130
    invoke-virtual {p1, v3}, LR/e;->l(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    return-object v2

    .line 134
    :pswitch_3
    check-cast p1, Landroid/view/MotionEvent;

    .line 135
    .line 136
    check-cast v3, Lv0/r;

    .line 137
    .line 138
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    const/4 v1, 0x0

    .line 143
    const-string v5, "onTouchEvent"

    .line 144
    .line 145
    if-nez v0, :cond_4

    .line 146
    .line 147
    check-cast v4, Lt2/e;

    .line 148
    .line 149
    iget-object v0, v3, Lv0/r;->q:LZ0/d;

    .line 150
    .line 151
    if-eqz v0, :cond_3

    .line 152
    .line 153
    invoke-virtual {v0, p1}, LZ0/d;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    check-cast p1, Ljava/lang/Boolean;

    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-eqz p1, :cond_2

    .line 164
    .line 165
    sget-object p1, Lv0/p;->r:Lv0/p;

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_2
    sget-object p1, Lv0/p;->s:Lv0/p;

    .line 169
    .line 170
    :goto_3
    iput-object p1, v4, Lt2/e;->r:Ljava/lang/Object;

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_3
    invoke-static {v5}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw v1

    .line 177
    :cond_4
    iget-object v0, v3, Lv0/r;->q:LZ0/d;

    .line 178
    .line 179
    if-eqz v0, :cond_5

    .line 180
    .line 181
    invoke-virtual {v0, p1}, LZ0/d;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    :goto_4
    return-object v2

    .line 185
    :cond_5
    invoke-static {v5}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    throw v1

    .line 189
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 190
    .line 191
    check-cast v4, Ly/i;

    .line 192
    .line 193
    check-cast v3, Ly/h;

    .line 194
    .line 195
    invoke-virtual {v4, v3}, Ly/i;->b(Ly/h;)V

    .line 196
    .line 197
    .line 198
    return-object v2

    .line 199
    :pswitch_5
    move-object v5, p1

    .line 200
    check-cast v5, LB0/N;

    .line 201
    .line 202
    invoke-virtual {v5}, LB0/N;->a()V

    .line 203
    .line 204
    .line 205
    move-object v6, v4

    .line 206
    check-cast v6, Lj0/g;

    .line 207
    .line 208
    move-object v7, v3

    .line 209
    check-cast v7, Lj0/B;

    .line 210
    .line 211
    const/4 v9, 0x0

    .line 212
    const/16 v10, 0x3c

    .line 213
    .line 214
    const/4 v8, 0x0

    .line 215
    invoke-static/range {v5 .. v10}, Ll0/d;->j(Ll0/d;Lj0/A;Lj0/B;FLl0/g;I)V

    .line 216
    .line 217
    .line 218
    return-object v2

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
