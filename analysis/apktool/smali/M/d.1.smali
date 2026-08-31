.class public final LM/d;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# static fields
.field public static final r:LM/d;

.field public static final s:LM/d;

.field public static final t:LM/d;

.field public static final u:LM/d;

.field public static final v:LM/d;


# instance fields
.field public final synthetic q:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LM/d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, LM/d;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LM/d;->r:LM/d;

    .line 9
    .line 10
    new-instance v0, LM/d;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, LM/d;-><init>(II)V

    .line 14
    .line 15
    .line 16
    sput-object v0, LM/d;->s:LM/d;

    .line 17
    .line 18
    new-instance v0, LM/d;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {v0, v1, v2}, LM/d;-><init>(II)V

    .line 22
    .line 23
    .line 24
    sput-object v0, LM/d;->t:LM/d;

    .line 25
    .line 26
    new-instance v0, LM/d;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {v0, v1, v2}, LM/d;-><init>(II)V

    .line 30
    .line 31
    .line 32
    sput-object v0, LM/d;->u:LM/d;

    .line 33
    .line 34
    new-instance v0, LM/d;

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    invoke-direct {v0, v1, v2}, LM/d;-><init>(II)V

    .line 38
    .line 39
    .line 40
    sput-object v0, LM/d;->v:LM/d;

    .line 41
    .line 42
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, LM/d;->q:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LM/d;->q:I

    .line 2
    .line 3
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, LI0/i;

    .line 9
    .line 10
    sget-object v0, LI0/r;->a:[LH5/k;

    .line 11
    .line 12
    sget-object v0, LI0/p;->l:LI0/s;

    .line 13
    .line 14
    sget-object v2, LI0/r;->a:[LH5/k;

    .line 15
    .line 16
    const/4 v3, 0x5

    .line 17
    aget-object v2, v2, v3

    .line 18
    .line 19
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v0, p1, v2}, LI0/s;->a(LI0/i;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object v1

    .line 25
    :pswitch_0
    check-cast p1, LI0/i;

    .line 26
    .line 27
    return-object v1

    .line 28
    :pswitch_1
    check-cast p1, LI0/i;

    .line 29
    .line 30
    sget-object v0, LI0/r;->a:[LH5/k;

    .line 31
    .line 32
    sget-object v0, LI0/p;->u:LI0/s;

    .line 33
    .line 34
    invoke-virtual {p1, v0, v1}, LI0/i;->j(LI0/s;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :pswitch_2
    check-cast p1, LI0/i;

    .line 39
    .line 40
    sget-object v0, LI0/r;->a:[LH5/k;

    .line 41
    .line 42
    sget-object v0, LI0/p;->m:LI0/s;

    .line 43
    .line 44
    sget-object v2, LI0/r;->a:[LH5/k;

    .line 45
    .line 46
    const/4 v3, 0x6

    .line 47
    aget-object v2, v2, v3

    .line 48
    .line 49
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {v0, p1, v2}, LI0/s;->a(LI0/i;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :pswitch_3
    check-cast p1, LM/J0;

    .line 56
    .line 57
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 58
    .line 59
    return-object p1

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
