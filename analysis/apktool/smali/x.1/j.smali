.class public final Lx/j;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:F

.field public final synthetic s:Lkotlin/jvm/internal/v;

.field public final synthetic t:Lw/i0;

.field public final synthetic u:LB5/c;


# direct methods
.method public synthetic constructor <init>(FLkotlin/jvm/internal/v;Lw/i0;LB5/c;I)V
    .locals 0

    .line 1
    iput p5, p0, Lx/j;->q:I

    iput p1, p0, Lx/j;->r:F

    iput-object p2, p0, Lx/j;->s:Lkotlin/jvm/internal/v;

    iput-object p3, p0, Lx/j;->t:Lw/i0;

    iput-object p4, p0, Lx/j;->u:LB5/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lx/j;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lu/j;

    .line 7
    .line 8
    iget-object v0, p1, Lu/j;->e:LP/f0;

    .line 9
    .line 10
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget v1, p0, Lx/j;->r:F

    .line 21
    .line 22
    invoke-static {v0, v1}, Lx/l;->d(FF)F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v1, p0, Lx/j;->s:Lkotlin/jvm/internal/v;

    .line 27
    .line 28
    iget v2, v1, Lkotlin/jvm/internal/v;->q:F

    .line 29
    .line 30
    sub-float v2, v0, v2

    .line 31
    .line 32
    :try_start_0
    iget-object v3, p0, Lx/j;->t:Lw/i0;

    .line 33
    .line 34
    invoke-interface {v3, v2}, Lw/i0;->a(F)F

    .line 35
    .line 36
    .line 37
    move-result v3
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    goto :goto_0

    .line 39
    :catch_0
    invoke-virtual {p1}, Lu/j;->a()V

    .line 40
    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    :goto_0
    iget-object v4, p0, Lx/j;->u:LB5/c;

    .line 44
    .line 45
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-interface {v4, v5}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    sub-float/2addr v2, v3

    .line 53
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    const/high16 v4, 0x3f000000    # 0.5f

    .line 58
    .line 59
    cmpl-float v2, v2, v4

    .line 60
    .line 61
    if-gtz v2, :cond_0

    .line 62
    .line 63
    iget-object v2, p1, Lu/j;->e:LP/f0;

    .line 64
    .line 65
    invoke-virtual {v2}, LP/f0;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Ljava/lang/Number;

    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    cmpg-float v0, v0, v2

    .line 76
    .line 77
    if-nez v0, :cond_0

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_0
    invoke-virtual {p1}, Lu/j;->a()V

    .line 81
    .line 82
    .line 83
    :goto_1
    iget p1, v1, Lkotlin/jvm/internal/v;->q:F

    .line 84
    .line 85
    add-float/2addr p1, v3

    .line 86
    iput p1, v1, Lkotlin/jvm/internal/v;->q:F

    .line 87
    .line 88
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 89
    .line 90
    return-object p1

    .line 91
    :pswitch_0
    check-cast p1, Lu/j;

    .line 92
    .line 93
    iget-object v0, p1, Lu/j;->e:LP/f0;

    .line 94
    .line 95
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Ljava/lang/Number;

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    iget v2, p0, Lx/j;->r:F

    .line 110
    .line 111
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    cmpl-float v1, v1, v3

    .line 116
    .line 117
    iget-object v3, p0, Lx/j;->u:LB5/c;

    .line 118
    .line 119
    iget-object v4, p0, Lx/j;->t:Lw/i0;

    .line 120
    .line 121
    iget-object v5, p0, Lx/j;->s:Lkotlin/jvm/internal/v;

    .line 122
    .line 123
    if-ltz v1, :cond_1

    .line 124
    .line 125
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, Ljava/lang/Number;

    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    invoke-static {v0, v2}, Lx/l;->d(FF)F

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    iget v1, v5, Lkotlin/jvm/internal/v;->q:F

    .line 140
    .line 141
    sub-float v1, v0, v1

    .line 142
    .line 143
    invoke-static {p1, v4, v3, v1}, Lx/l;->b(Lu/j;Lw/i0;LB5/c;F)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1}, Lu/j;->a()V

    .line 147
    .line 148
    .line 149
    iput v0, v5, Lkotlin/jvm/internal/v;->q:F

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_1
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    check-cast v1, Ljava/lang/Number;

    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    iget v2, v5, Lkotlin/jvm/internal/v;->q:F

    .line 163
    .line 164
    sub-float/2addr v1, v2

    .line 165
    invoke-static {p1, v4, v3, v1}, Lx/l;->b(Lu/j;Lw/i0;LB5/c;F)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    check-cast p1, Ljava/lang/Number;

    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    iput p1, v5, Lkotlin/jvm/internal/v;->q:F

    .line 179
    .line 180
    :goto_2
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 181
    .line 182
    return-object p1

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
