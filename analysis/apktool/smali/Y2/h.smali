.class public abstract LY2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lm5/o;

.field public static final b:Lm5/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LR4/b2;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, LR4/b2;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lm5/a;->d(LB5/a;)Lm5/o;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, LY2/h;->a:Lm5/o;

    .line 13
    .line 14
    new-instance v0, LR4/b2;

    .line 15
    .line 16
    const/16 v1, 0xf

    .line 17
    .line 18
    invoke-direct {v0, v1}, LR4/b2;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lm5/a;->d(LB5/a;)Lm5/o;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, LY2/h;->b:Lm5/o;

    .line 26
    .line 27
    return-void
.end method
