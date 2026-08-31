.class public abstract LM/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LP/T0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, LM/j;->u:LM/j;

    .line 2
    .line 3
    invoke-static {v0}, Lm5/a;->d(LB5/a;)Lm5/o;

    .line 4
    .line 5
    .line 6
    sget-object v0, LM/j;->v:LM/j;

    .line 7
    .line 8
    new-instance v1, LP/T0;

    .line 9
    .line 10
    invoke-direct {v1, v0}, LP/l0;-><init>(LB5/a;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, LM/y;->a:LP/T0;

    .line 14
    .line 15
    return-void
.end method
