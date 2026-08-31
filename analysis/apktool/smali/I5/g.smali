.class public final LI5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI5/i;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Lm5/e;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;LB5/e;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LI5/g;->a:I

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LI5/g;->b:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, LI5/g;->c:Lm5/e;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;LB5/c;I)V
    .locals 0

    .line 1
    iput p3, p0, LI5/g;->a:I

    iput-object p1, p0, LI5/g;->b:Ljava/lang/Object;

    iput-object p2, p0, LI5/g;->c:Lm5/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget v0, p0, LI5/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LJ5/b;

    .line 7
    .line 8
    invoke-direct {v0, p0}, LJ5/b;-><init>(LI5/g;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, LI5/h;

    .line 13
    .line 14
    invoke-direct {v0, p0}, LI5/h;-><init>(LI5/g;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_1
    new-instance v0, LI5/f;

    .line 19
    .line 20
    invoke-direct {v0, p0}, LI5/f;-><init>(LI5/g;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
