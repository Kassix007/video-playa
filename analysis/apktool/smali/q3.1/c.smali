.class public abstract Lq3/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LR4/b2;

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    invoke-direct {v0, v1}, LR4/b2;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lm5/i;->r:Lm5/i;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lm5/a;->c(Lm5/i;LB5/a;)Lm5/h;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lq3/c;->a:Ljava/lang/Object;

    .line 15
    .line 16
    return-void
.end method
