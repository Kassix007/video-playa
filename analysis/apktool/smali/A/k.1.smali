.class public final LA/k;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:I

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, LA/k;->q:I

    iput-object p3, p0, LA/k;->s:Ljava/lang/Object;

    iput p1, p0, LA/k;->r:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LA/k;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LP/o;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    and-int/lit8 v0, p2, 0x3

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    move v0, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v0, v2

    .line 24
    :goto_0
    and-int/2addr p2, v3

    .line 25
    invoke-virtual {p1, p2, v0}, LP/o;->K(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    iget-object p2, p0, LA/k;->s:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p2, LF/x;

    .line 34
    .line 35
    iget-object p2, p2, LF/x;->b:LE/C;

    .line 36
    .line 37
    invoke-virtual {p2}, LE/C;->k()LE/Y;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iget v0, p0, LA/k;->r:I

    .line 42
    .line 43
    invoke-virtual {p2, v0}, LE/Y;->f(I)LE/i;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    iget v1, p2, LE/i;->a:I

    .line 48
    .line 49
    sub-int/2addr v0, v1

    .line 50
    iget-object p2, p2, LE/i;->c:LE/q;

    .line 51
    .line 52
    check-cast p2, LF/q;

    .line 53
    .line 54
    iget-object p2, p2, LF/q;->b:LB5/g;

    .line 55
    .line 56
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    sget-object v2, LF/C;->a:LF/C;

    .line 65
    .line 66
    invoke-interface {p2, v2, v0, p1, v1}, LB5/g;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-virtual {p1}, LP/o;->N()V

    .line 71
    .line 72
    .line 73
    :goto_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 74
    .line 75
    return-object p1

    .line 76
    :pswitch_0
    check-cast p1, LP/o;

    .line 77
    .line 78
    check-cast p2, Ljava/lang/Number;

    .line 79
    .line 80
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    and-int/lit8 v0, p2, 0x3

    .line 85
    .line 86
    const/4 v1, 0x2

    .line 87
    const/4 v2, 0x1

    .line 88
    if-eq v0, v1, :cond_2

    .line 89
    .line 90
    move v0, v2

    .line 91
    goto :goto_2

    .line 92
    :cond_2
    const/4 v0, 0x0

    .line 93
    :goto_2
    and-int/2addr p2, v2

    .line 94
    invoke-virtual {p1, p2, v0}, LP/o;->K(IZ)Z

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    if-eqz p2, :cond_3

    .line 99
    .line 100
    iget-object p2, p0, LA/k;->s:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p2, LD/i;

    .line 103
    .line 104
    iget-object p2, p2, LD/i;->b:LD/h;

    .line 105
    .line 106
    iget-object p2, p2, LD/h;->c:LE/Y;

    .line 107
    .line 108
    iget v0, p0, LA/k;->r:I

    .line 109
    .line 110
    invoke-virtual {p2, v0}, LE/Y;->f(I)LE/i;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    iget v1, p2, LE/i;->a:I

    .line 115
    .line 116
    sub-int/2addr v0, v1

    .line 117
    iget-object p2, p2, LE/i;->c:LE/q;

    .line 118
    .line 119
    check-cast p2, LD/f;

    .line 120
    .line 121
    iget-object p2, p2, LD/f;->c:LX/e;

    .line 122
    .line 123
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const/4 v1, 0x6

    .line 128
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    sget-object v2, LD/j;->a:LD/j;

    .line 133
    .line 134
    invoke-virtual {p2, v2, v0, p1, v1}, LX/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_3
    invoke-virtual {p1}, LP/o;->N()V

    .line 139
    .line 140
    .line 141
    :goto_3
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 142
    .line 143
    return-object p1

    .line 144
    :pswitch_1
    check-cast p1, LP/o;

    .line 145
    .line 146
    check-cast p2, Ljava/lang/Number;

    .line 147
    .line 148
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    and-int/lit8 v0, p2, 0x3

    .line 153
    .line 154
    const/4 v1, 0x2

    .line 155
    const/4 v2, 0x0

    .line 156
    const/4 v3, 0x1

    .line 157
    if-eq v0, v1, :cond_4

    .line 158
    .line 159
    move v0, v3

    .line 160
    goto :goto_4

    .line 161
    :cond_4
    move v0, v2

    .line 162
    :goto_4
    and-int/2addr p2, v3

    .line 163
    invoke-virtual {p1, p2, v0}, LP/o;->K(IZ)Z

    .line 164
    .line 165
    .line 166
    move-result p2

    .line 167
    if-eqz p2, :cond_5

    .line 168
    .line 169
    iget-object p2, p0, LA/k;->s:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast p2, LC/h;

    .line 172
    .line 173
    iget-object v0, p2, LC/h;->b:LC/g;

    .line 174
    .line 175
    iget-object v0, v0, LC/g;->b:LE/Y;

    .line 176
    .line 177
    iget v1, p0, LA/k;->r:I

    .line 178
    .line 179
    invoke-virtual {v0, v1}, LE/Y;->f(I)LE/i;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    iget v3, v0, LE/i;->a:I

    .line 184
    .line 185
    sub-int/2addr v1, v3

    .line 186
    iget-object v0, v0, LE/i;->c:LE/q;

    .line 187
    .line 188
    check-cast v0, LC/f;

    .line 189
    .line 190
    iget-object v0, v0, LC/f;->b:LX/e;

    .line 191
    .line 192
    iget-object p2, p2, LC/h;->c:LC/c;

    .line 193
    .line 194
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-virtual {v0, p2, v1, p1, v2}, LX/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_5
    invoke-virtual {p1}, LP/o;->N()V

    .line 207
    .line 208
    .line 209
    :goto_5
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 210
    .line 211
    return-object p1

    .line 212
    :pswitch_2
    check-cast p1, LP/o;

    .line 213
    .line 214
    check-cast p2, Ljava/lang/Number;

    .line 215
    .line 216
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 217
    .line 218
    .line 219
    iget-object p2, p0, LA/k;->s:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast p2, Lc0/m;

    .line 222
    .line 223
    iget v0, p0, LA/k;->r:I

    .line 224
    .line 225
    or-int/lit8 v0, v0, 0x1

    .line 226
    .line 227
    invoke-static {v0}, LP/b;->w(I)I

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    invoke-static {p2, p1, v0}, LA/n;->a(Lc0/m;LP/o;I)V

    .line 232
    .line 233
    .line 234
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 235
    .line 236
    return-object p1

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
