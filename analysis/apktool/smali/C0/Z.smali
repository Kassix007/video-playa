.class public final LC0/Z;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;LB5/e;II)V
    .locals 0

    .line 1
    iput p5, p0, LC0/Z;->q:I

    iput-object p1, p0, LC0/Z;->t:Ljava/lang/Object;

    iput-object p2, p0, LC0/Z;->r:Ljava/lang/Object;

    iput-object p3, p0, LC0/Z;->s:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, LC0/Z;->q:I

    iput-object p1, p0, LC0/Z;->t:Ljava/lang/Object;

    iput-object p2, p0, LC0/Z;->r:Ljava/lang/Object;

    iput-object p3, p0, LC0/Z;->s:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LC0/Z;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    check-cast p2, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 15
    .line 16
    .line 17
    iget-object p2, p0, LC0/Z;->t:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p2, Lkotlin/jvm/internal/v;

    .line 20
    .line 21
    iget v0, p2, Lkotlin/jvm/internal/v;->q:F

    .line 22
    .line 23
    sub-float/2addr p1, v0

    .line 24
    iget-object v0, p0, LC0/Z;->r:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lw/H0;

    .line 27
    .line 28
    iget-object v1, p0, LC0/Z;->s:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lw/E0;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lw/H0;->d(F)F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-virtual {v0, p1}, Lw/H0;->h(F)J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    iget-object p1, v1, Lw/E0;->a:Lw/H0;

    .line 41
    .line 42
    iget-object v1, p1, Lw/H0;->j:Lw/i0;

    .line 43
    .line 44
    const/4 v4, 0x1

    .line 45
    invoke-static {p1, v1, v2, v3, v4}, Lw/H0;->a(Lw/H0;Lw/i0;JI)J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    invoke-virtual {v0, v1, v2}, Lw/H0;->g(J)F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-virtual {v0, p1}, Lw/H0;->d(F)F

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    iget v0, p2, Lkotlin/jvm/internal/v;->q:F

    .line 58
    .line 59
    add-float/2addr v0, p1

    .line 60
    iput v0, p2, Lkotlin/jvm/internal/v;->q:F

    .line 61
    .line 62
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 63
    .line 64
    return-object p1

    .line 65
    :pswitch_0
    check-cast p1, LP/o;

    .line 66
    .line 67
    check-cast p2, Ljava/lang/Number;

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 70
    .line 71
    .line 72
    iget-object p2, p0, LC0/Z;->t:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p2, LB5/a;

    .line 75
    .line 76
    iget-object v0, p0, LC0/Z;->r:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, La1/i;

    .line 79
    .line 80
    iget-object v1, p0, LC0/Z;->s:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, LX/e;

    .line 83
    .line 84
    const/16 v2, 0x181

    .line 85
    .line 86
    invoke-static {v2}, LP/b;->w(I)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-static {p2, v0, v1, p1, v2}, Ln5/A;->c(LB5/a;La1/i;LX/e;LP/o;I)V

    .line 91
    .line 92
    .line 93
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 94
    .line 95
    return-object p1

    .line 96
    :pswitch_1
    check-cast p1, LP/o;

    .line 97
    .line 98
    check-cast p2, Ljava/lang/Number;

    .line 99
    .line 100
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 101
    .line 102
    .line 103
    iget-object p2, p0, LC0/Z;->t:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p2, LB0/t0;

    .line 106
    .line 107
    iget-object v0, p0, LC0/Z;->r:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, LC0/i0;

    .line 110
    .line 111
    iget-object v1, p0, LC0/Z;->s:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v1, LB5/e;

    .line 114
    .line 115
    const/4 v2, 0x1

    .line 116
    invoke-static {v2}, LP/b;->w(I)I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    invoke-static {p2, v0, v1, p1, v2}, LC0/t0;->a(LB0/t0;LC0/i0;LB5/e;LP/o;I)V

    .line 121
    .line 122
    .line 123
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 124
    .line 125
    return-object p1

    .line 126
    :pswitch_2
    check-cast p1, LP/o;

    .line 127
    .line 128
    check-cast p2, Ljava/lang/Number;

    .line 129
    .line 130
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    and-int/lit8 v0, p2, 0x3

    .line 135
    .line 136
    const/4 v1, 0x2

    .line 137
    const/4 v2, 0x0

    .line 138
    const/4 v3, 0x1

    .line 139
    if-eq v0, v1, :cond_0

    .line 140
    .line 141
    move v0, v3

    .line 142
    goto :goto_0

    .line 143
    :cond_0
    move v0, v2

    .line 144
    :goto_0
    and-int/2addr p2, v3

    .line 145
    invoke-virtual {p1, p2, v0}, LP/o;->K(IZ)Z

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    if-eqz p2, :cond_1

    .line 150
    .line 151
    iget-object p2, p0, LC0/Z;->t:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast p2, LC0/A;

    .line 154
    .line 155
    iget-object v0, p0, LC0/Z;->r:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, LC0/i0;

    .line 158
    .line 159
    iget-object v1, p0, LC0/Z;->s:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v1, LB5/e;

    .line 162
    .line 163
    invoke-static {p2, v0, v1, p1, v2}, LC0/t0;->a(LB0/t0;LC0/i0;LB5/e;LP/o;I)V

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_1
    invoke-virtual {p1}, LP/o;->N()V

    .line 168
    .line 169
    .line 170
    :goto_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 171
    .line 172
    return-object p1

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
