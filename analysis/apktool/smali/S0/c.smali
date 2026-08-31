.class public final LS0/c;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/g;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LS0/c;->q:I

    iput-object p2, p0, LS0/c;->r:Ljava/lang/Object;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, LS0/c;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 7
    .line 8
    check-cast p2, Landroid/database/sqlite/SQLiteCursorDriver;

    .line 9
    .line 10
    check-cast p3, Ljava/lang/String;

    .line 11
    .line 12
    check-cast p4, Landroid/database/sqlite/SQLiteQuery;

    .line 13
    .line 14
    iget-object p1, p0, LS0/c;->r:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Lj2/f;

    .line 17
    .line 18
    new-instance v0, Lk2/h;

    .line 19
    .line 20
    invoke-static {p4}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p4}, Lk2/h;-><init>(Landroid/database/sqlite/SQLiteProgram;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v0}, Lj2/f;->f(Lj2/e;)V

    .line 27
    .line 28
    .line 29
    new-instance p1, Landroid/database/sqlite/SQLiteCursor;

    .line 30
    .line 31
    invoke-direct {p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteCursor;-><init>(Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    check-cast p2, Ljava/lang/Number;

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    check-cast p3, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    check-cast p4, Ljava/lang/Number;

    .line 54
    .line 55
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    iget-object p3, p0, LS0/c;->r:Ljava/lang/Object;

    .line 60
    .line 61
    move-object v0, p3

    .line 62
    check-cast v0, Landroid/view/ViewStructure;

    .line 63
    .line 64
    sub-int v5, p1, v1

    .line 65
    .line 66
    sub-int v6, p2, v2

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    const/4 v4, 0x0

    .line 70
    invoke-virtual/range {v0 .. v6}, Landroid/view/ViewStructure;->setDimens(IIIIII)V

    .line 71
    .line 72
    .line 73
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 74
    .line 75
    return-object p1

    .line 76
    :pswitch_1
    check-cast p1, LO0/p;

    .line 77
    .line 78
    check-cast p2, LO0/j;

    .line 79
    .line 80
    check-cast p3, LO0/h;

    .line 81
    .line 82
    iget p3, p3, LO0/h;->a:I

    .line 83
    .line 84
    check-cast p4, LO0/i;

    .line 85
    .line 86
    iget p4, p4, LO0/i;->a:I

    .line 87
    .line 88
    iget-object v0, p0, LS0/c;->r:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, LS0/d;

    .line 91
    .line 92
    iget-object v1, v0, LS0/d;->e:LO0/d;

    .line 93
    .line 94
    check-cast v1, LO0/e;

    .line 95
    .line 96
    invoke-virtual {v1, p1, p2, p3, p4}, LO0/e;->b(LO0/p;LO0/j;II)LO0/r;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    instance-of p2, p1, LO0/r;

    .line 101
    .line 102
    const-string p3, "null cannot be cast to non-null type android.graphics.Typeface"

    .line 103
    .line 104
    if-nez p2, :cond_0

    .line 105
    .line 106
    new-instance p2, LB0/G0;

    .line 107
    .line 108
    iget-object p4, v0, LS0/d;->j:LB0/G0;

    .line 109
    .line 110
    invoke-direct {p2, p1, p4}, LB0/G0;-><init>(LO0/r;LB0/G0;)V

    .line 111
    .line 112
    .line 113
    iput-object p2, v0, LS0/d;->j:LB0/G0;

    .line 114
    .line 115
    iget-object p1, p2, LB0/G0;->r:Ljava/lang/Object;

    .line 116
    .line 117
    invoke-static {p1, p3}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    check-cast p1, Landroid/graphics/Typeface;

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_0
    iget-object p1, p1, LO0/r;->q:Ljava/lang/Object;

    .line 124
    .line 125
    invoke-static {p1, p3}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    check-cast p1, Landroid/graphics/Typeface;

    .line 129
    .line 130
    :goto_0
    return-object p1

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
