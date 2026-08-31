.class public final Lb/w;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Lb/A;


# direct methods
.method public synthetic constructor <init>(Lb/A;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb/w;->q:I

    iput-object p1, p0, Lb/w;->r:Lb/A;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lb/w;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb/w;->r:Lb/A;

    .line 7
    .line 8
    invoke-virtual {v0}, Lb/A;->c()V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    iget-object v0, p0, Lb/w;->r:Lb/A;

    .line 15
    .line 16
    invoke-virtual {v0}, Lb/A;->b()V

    .line 17
    .line 18
    .line 19
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    iget-object v0, p0, Lb/w;->r:Lb/A;

    .line 23
    .line 24
    invoke-virtual {v0}, Lb/A;->c()V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
