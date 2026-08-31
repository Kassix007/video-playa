.class public final LZ0/b;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# static fields
.field public static final r:LZ0/b;

.field public static final s:LZ0/b;

.field public static final t:LZ0/b;

.field public static final u:LZ0/b;


# instance fields
.field public final synthetic q:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LZ0/b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, LZ0/b;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LZ0/b;->r:LZ0/b;

    .line 9
    .line 10
    new-instance v0, LZ0/b;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, LZ0/b;-><init>(II)V

    .line 14
    .line 15
    .line 16
    sput-object v0, LZ0/b;->s:LZ0/b;

    .line 17
    .line 18
    new-instance v0, LZ0/b;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {v0, v1, v2}, LZ0/b;-><init>(II)V

    .line 22
    .line 23
    .line 24
    sput-object v0, LZ0/b;->t:LZ0/b;

    .line 25
    .line 26
    new-instance v0, LZ0/b;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {v0, v1, v2}, LZ0/b;-><init>(II)V

    .line 30
    .line 31
    .line 32
    sput-object v0, LZ0/b;->u:LZ0/b;

    .line 33
    .line 34
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, LZ0/b;->q:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LZ0/b;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/view/View;

    .line 7
    .line 8
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 9
    .line 10
    return-object p1

    .line 11
    :pswitch_0
    check-cast p1, LI0/i;

    .line 12
    .line 13
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_1
    check-cast p1, Lz0/I;

    .line 17
    .line 18
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_2
    check-cast p1, LZ0/j;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object p1, p1, LZ0/j;->G:LZ0/i;

    .line 28
    .line 29
    new-instance v1, LC0/z;

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    invoke-direct {v1, p1, v2}, LC0/z;-><init>(LB5/a;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 36
    .line 37
    .line 38
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 39
    .line 40
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
