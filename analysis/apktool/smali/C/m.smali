.class public final LC/m;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/f;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LE/A;

.field public final synthetic s:J

.field public final synthetic t:I

.field public final synthetic u:I


# direct methods
.method public synthetic constructor <init>(LE/A;JIII)V
    .locals 0

    .line 1
    iput p6, p0, LC/m;->q:I

    iput-object p1, p0, LC/m;->r:LE/A;

    iput-wide p2, p0, LC/m;->s:J

    iput p4, p0, LC/m;->t:I

    iput p5, p0, LC/m;->u:I

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LC/m;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    check-cast p2, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    check-cast p3, LB5/c;

    .line 19
    .line 20
    iget v0, p0, LC/m;->t:I

    .line 21
    .line 22
    add-int/2addr p1, v0

    .line 23
    iget-wide v0, p0, LC/m;->s:J

    .line 24
    .line 25
    invoke-static {p1, v0, v1}, LW0/b;->f(IJ)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iget v2, p0, LC/m;->u:I

    .line 30
    .line 31
    add-int/2addr p2, v2

    .line 32
    invoke-static {p2, v0, v1}, LW0/b;->e(IJ)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    iget-object v0, p0, LC/m;->r:LE/A;

    .line 37
    .line 38
    iget-object v0, v0, LE/A;->r:Lz0/T;

    .line 39
    .line 40
    sget-object v1, Ln5/t;->q:Ln5/t;

    .line 41
    .line 42
    invoke-interface {v0, p1, p2, v1, p3}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    check-cast p2, Ljava/lang/Number;

    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    check-cast p3, LB5/c;

    .line 60
    .line 61
    iget v0, p0, LC/m;->t:I

    .line 62
    .line 63
    add-int/2addr p1, v0

    .line 64
    iget-wide v0, p0, LC/m;->s:J

    .line 65
    .line 66
    invoke-static {p1, v0, v1}, LW0/b;->f(IJ)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    iget v2, p0, LC/m;->u:I

    .line 71
    .line 72
    add-int/2addr p2, v2

    .line 73
    invoke-static {p2, v0, v1}, LW0/b;->e(IJ)I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    iget-object v0, p0, LC/m;->r:LE/A;

    .line 78
    .line 79
    iget-object v0, v0, LE/A;->r:Lz0/T;

    .line 80
    .line 81
    sget-object v1, Ln5/t;->q:Ln5/t;

    .line 82
    .line 83
    invoke-interface {v0, p1, p2, v1, p3}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    check-cast p2, Ljava/lang/Number;

    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    check-cast p3, LB5/c;

    .line 101
    .line 102
    iget v0, p0, LC/m;->t:I

    .line 103
    .line 104
    add-int/2addr p1, v0

    .line 105
    iget-wide v0, p0, LC/m;->s:J

    .line 106
    .line 107
    invoke-static {p1, v0, v1}, LW0/b;->f(IJ)I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    iget v2, p0, LC/m;->u:I

    .line 112
    .line 113
    add-int/2addr p2, v2

    .line 114
    invoke-static {p2, v0, v1}, LW0/b;->e(IJ)I

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    iget-object v0, p0, LC/m;->r:LE/A;

    .line 119
    .line 120
    iget-object v0, v0, LE/A;->r:Lz0/T;

    .line 121
    .line 122
    sget-object v1, Ln5/t;->q:Ln5/t;

    .line 123
    .line 124
    invoke-interface {v0, p1, p2, v1, p3}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    return-object p1

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
