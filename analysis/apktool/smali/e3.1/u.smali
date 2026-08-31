.class public final Le3/u;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/f;


# instance fields
.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(ILq5/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Le3/u;->q:I

    invoke-direct {p0, p1, p2}, Ls5/i;-><init>(ILq5/c;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Le3/u;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lw/g0;

    .line 7
    .line 8
    check-cast p2, Li0/b;

    .line 9
    .line 10
    iget-wide p1, p2, Li0/b;->a:J

    .line 11
    .line 12
    check-cast p3, Lq5/c;

    .line 13
    .line 14
    new-instance p1, Le3/u;

    .line 15
    .line 16
    const/4 p2, 0x3

    .line 17
    const/4 v0, 0x3

    .line 18
    invoke-direct {p1, p2, p3, v0}, Le3/u;-><init>(ILq5/c;I)V

    .line 19
    .line 20
    .line 21
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Le3/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    return-object p2

    .line 27
    :pswitch_0
    check-cast p1, LM5/w;

    .line 28
    .line 29
    check-cast p2, Ljava/lang/Number;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 32
    .line 33
    .line 34
    check-cast p3, Lq5/c;

    .line 35
    .line 36
    new-instance p1, Le3/u;

    .line 37
    .line 38
    const/4 p2, 0x3

    .line 39
    const/4 v0, 0x2

    .line 40
    invoke-direct {p1, p2, p3, v0}, Le3/u;-><init>(ILq5/c;I)V

    .line 41
    .line 42
    .line 43
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 44
    .line 45
    invoke-virtual {p1, p2}, Le3/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    return-object p2

    .line 49
    :pswitch_1
    check-cast p1, LM5/w;

    .line 50
    .line 51
    check-cast p2, Li0/b;

    .line 52
    .line 53
    iget-wide p1, p2, Li0/b;->a:J

    .line 54
    .line 55
    check-cast p3, Lq5/c;

    .line 56
    .line 57
    new-instance p1, Le3/u;

    .line 58
    .line 59
    const/4 p2, 0x3

    .line 60
    const/4 v0, 0x1

    .line 61
    invoke-direct {p1, p2, p3, v0}, Le3/u;-><init>(ILq5/c;I)V

    .line 62
    .line 63
    .line 64
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 65
    .line 66
    invoke-virtual {p1, p2}, Le3/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    return-object p2

    .line 70
    :pswitch_2
    check-cast p1, Ljava/lang/Number;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 73
    .line 74
    .line 75
    check-cast p2, Ljava/lang/Throwable;

    .line 76
    .line 77
    check-cast p3, Lq5/c;

    .line 78
    .line 79
    new-instance p1, Le3/u;

    .line 80
    .line 81
    const/4 p2, 0x3

    .line 82
    const/4 v0, 0x0

    .line 83
    invoke-direct {p1, p2, p3, v0}, Le3/u;-><init>(ILq5/c;I)V

    .line 84
    .line 85
    .line 86
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 87
    .line 88
    invoke-virtual {p1, p2}, Le3/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 92
    .line 93
    return-object p1

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Le3/u;->q:I

    .line 2
    .line 3
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-object v1

    .line 12
    :pswitch_0
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v1

    .line 16
    :pswitch_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :pswitch_2
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    return-object p1

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
